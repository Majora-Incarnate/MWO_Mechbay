package Parser;

import Utility.TechBase;
import Utility.WeaponBlueprint;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.DirectoryIteratorException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author Trevin
 */
public class Parser {

    private final String DATABASE_DIRECTORY = "\\Database\\";
    private final String CUSTOM_PREFIX = "Custom_";
    private final String FILETYPE_POSTFIX = ".csv";
    private final String USER_DIRECTORY = System.getProperty("user.dir");
    private final String MWO_DIRECTORY = "E:\\Program Files (x86)\\Steam\\steamapps\\common\\MechWarrior Online\\Game\\";
    private final String MECHZIP_FILEPATH = "mechs\\";
    private final String GAMEZIP_FILEPATH = "GameData.pak";
    private final String WEAPON_FILEPATH = "\\Libs\\Items\\Weapons\\Weapons.xml";
    private final String MECH_PATH = "";
    private final String OTHER_PATH = "";

    public Parser() {
        /*try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(MWO_DIRECTORY + MECHZIP_FILEPATH))) {
            for (Path file: stream) {
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e) {
            System.err.println(e);
        }*/
        
        /*try (final ZipInputStream pakStream = new ZipInputStream( new FileInputStream(MWO_DIRECTORY + GAMEZIP_FILEPATH))) {
            while (true) {
                ZipEntry entry = pakStream.getNextEntry();
                
                if (entry == null)
                    break;
                
                System.out.println(entry.getName());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        parse_weapons();
        
    }

    public void parse_all() {

    }

    private void parse_weapons() {
        try (final ZipFile pakFile = new ZipFile(MWO_DIRECTORY + GAMEZIP_FILEPATH)) {
            final FileWriter weaponDatabase = new FileWriter(USER_DIRECTORY + DATABASE_DIRECTORY + "Weapon" + FILETYPE_POSTFIX);
            ZipEntry entry = pakFile.getEntry("Libs/Items/Weapons/Weapons.xml");
            DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = db.parse(pakFile.getInputStream(entry));
            document.normalize();
            NodeList nodes = document.getDocumentElement().getChildNodes();
            
            for (int i = 0; i < nodes.getLength(); i++) {
                try {
                    WeaponBlueprint weapon = new WeaponBlueprint(nodes.item(i));
                    weaponDatabase.write(weapon.serializeToString());
                    weaponDatabase.write('\n');
                    System.out.println(String.format("Successfully wrote %s to file.", weapon.name));
                } catch (IllegalArgumentException ex) {
                    Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            weaponDatabase.close();

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}