package Utility;

import Mech.Actuator_Blueprint;
import Mech.Ammo_Blueprint;
import Mech.Armor_Blueprint;
import Mech.Chassis_Blueprint;
import Mech.Cockpit_Blueprint;
import Mech.Crittable;
import Mech.Engine_Blueprint;
import Mech.Equipment_Blueprint;
import Mech.Fire_Control_Blueprint;
import Mech.Gyro_Blueprint;
import Mech.Heatsink_Blueprint;
import Mech.Jumpjet_Blueprint;
import Mech.Model_Blueprint;
import Mech.Module_Blueprint;
import Mech.Section_Blueprint;
import Mech.Structure_Blueprint;
import Mech.Weapon_Blueprint;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public abstract interface Database
{
  public static final ArrayList<Chassis_Blueprint> master_chassis_blueprints = new ArrayList(0);
  public static final ArrayList<Model_Blueprint> master_model_blueprints = new ArrayList(0);
  public static final ArrayList<Section_Blueprint> master_section_blueprints = new ArrayList(0);
  public static final ArrayList<Model_Blueprint> selected_model_blueprints = new ArrayList(0);
  public static final ArrayList<Section_Blueprint>[] selected_section_blueprints = new ArrayList[8];
  public static final ArrayList<Cockpit_Blueprint> master_cockpit_blueprints = new ArrayList(0);
  public static final ArrayList<Engine_Blueprint> master_engine_blueprints = new ArrayList(0);
  public static final ArrayList<Gyro_Blueprint> master_gyro_blueprints = new ArrayList(0);
  public static final ArrayList<Armor_Blueprint> master_armor_blueprints = new ArrayList(0);
  public static final ArrayList<Structure_Blueprint> master_structure_blueprints = new ArrayList(0);
  public static final ArrayList<Heatsink_Blueprint> master_heatsink_blueprints = new ArrayList(0);
  public static final ArrayList<Jumpjet_Blueprint> master_jumpjet_blueprints = new ArrayList(0);
  public static final ArrayList<Fire_Control_Blueprint> master_firecontrol_blueprints = new ArrayList(0);
  public static final ArrayList<Weapon_Blueprint> master_weapon_blueprints = new ArrayList(0);
  public static final ArrayList<Ammo_Blueprint> master_ammo_blueprints = new ArrayList(0);
  public static final ArrayList<Equipment_Blueprint> master_equipment_blueprints = new ArrayList(0);
  public static final ArrayList<Actuator_Blueprint> master_actuator_blueprints = new ArrayList(0);
  public static final ArrayList<Module_Blueprint> master_module_blueprints = new ArrayList(0);
  public static final ArrayList<Cockpit_Blueprint> selected_cockpit_blueprints = new ArrayList(0);
  public static final ArrayList<Engine_Blueprint> selected_engine_blueprints = new ArrayList(0);
  public static final ArrayList<Gyro_Blueprint> selected_gyro_blueprints = new ArrayList(0);
  public static final ArrayList<Armor_Blueprint> selected_armor_blueprints = new ArrayList(0);
  public static final ArrayList<Structure_Blueprint> selected_structure_blueprints = new ArrayList(0);
  public static final ArrayList<Heatsink_Blueprint> selected_heatsink_blueprints = new ArrayList(0);
  public static final ArrayList<Jumpjet_Blueprint> selected_jumpjet_blueprints = new ArrayList(0);
  public static final ArrayList<Fire_Control_Blueprint> selected_firecontrol_blueprints = new ArrayList(0);
  public static final ArrayList<Weapon_Blueprint>[] selected_weapon_blueprints = new ArrayList[3];
  public static final ArrayList<Ammo_Blueprint> selected_ammo_blueprints = new ArrayList(0);
  public static final ArrayList<Equipment_Blueprint> selected_equipment_blueprints = new ArrayList(0);
  public static final ArrayList<Crittable> queued_items = new ArrayList(0);
  
  public static void Load_Blueprints()
  {
    for (int i = 0; i < 8; i++) {
      selected_section_blueprints[i] = new ArrayList(0);
    }
    for (i = 0; i < 3; i++) {
      selected_weapon_blueprints[i] = new ArrayList(0);
    }
    File localFile = new File(System.getProperty("user.dir") + "\\Database\\Actuator.csv");
    Object localObject1;
    Object localObject2;
    String str;
    try
    {
      FileInputStream localFileInputStream1 = new FileInputStream(localFile.getAbsoluteFile());
      localObject1 = null;
      try
      {
        BufferedReader localBufferedReader1 = new BufferedReader(new InputStreamReader(localFileInputStream1));
        localObject2 = null;
        try
        {
          str = null;
          localBufferedReader1.readLine();
          while ((str = localBufferedReader1.readLine()) != null) {
            master_actuator_blueprints.add(new Actuator_Blueprint(str));
          }
        }
        catch (Throwable localThrowable36)
        {
          localObject2 = localThrowable36;
          throw localThrowable36;
        }
        finally {}
      }
      catch (Throwable localThrowable2)
      {
        localObject1 = localThrowable2;
        throw localThrowable2;
      }
      finally
      {
        if (localFileInputStream1 != null) {
          if (localObject1 != null) {
            try
            {
              localFileInputStream1.close();
            }
            catch (Throwable localThrowable70)
            {
              ((Throwable)localObject1).addSuppressed(localThrowable70);
            }
          } else {
            localFileInputStream1.close();
          }
        }
      }
    }
    catch (IOException localIOException1)
    {
      JOptionPane.showMessageDialog(null, localIOException1.getMessage(), localIOException1.toString(), 0);
      System.exit(1);
    }
    localFile = new File(System.getProperty("user.dir") + "\\Database\\Ammo.csv");
    try
    {
      FileInputStream localFileInputStream2 = new FileInputStream(localFile.getAbsoluteFile());
      localObject1 = null;
      try
      {
        BufferedReader localBufferedReader2 = new BufferedReader(new InputStreamReader(localFileInputStream2));
        localObject2 = null;
        try
        {
          str = null;
          localBufferedReader2.readLine();
          while ((str = localBufferedReader2.readLine()) != null) {
            master_ammo_blueprints.add(new Ammo_Blueprint(str));
          }
        }
        catch (Throwable localThrowable38)
        {
          localObject2 = localThrowable38;
          throw localThrowable38;
        }
        finally {}
      }
      catch (Throwable localThrowable4)
      {
        localObject1 = localThrowable4;
        throw localThrowable4;
      }
      finally
      {
        if (localFileInputStream2 != null) {
          if (localObject1 != null) {
            try
            {
              localFileInputStream2.close();
            }
            catch (Throwable localThrowable72)
            {
              ((Throwable)localObject1).addSuppressed(localThrowable72);
            }
          } else {
            localFileInputStream2.close();
          }
        }
      }
    }
    catch (IOException localIOException2)
    {
      JOptionPane.showMessageDialog(null, localIOException2.getMessage(), localIOException2.toString(), 0);
      System.exit(1);
    }
    localFile = new File(System.getProperty("user.dir") + "\\Database\\Armor.csv");
    try
    {
      FileInputStream localFileInputStream3 = new FileInputStream(localFile.getAbsoluteFile());
      localObject1 = null;
      try
      {
        BufferedReader localBufferedReader3 = new BufferedReader(new InputStreamReader(localFileInputStream3));
        localObject2 = null;
        try
        {
          str = null;
          localBufferedReader3.readLine();
          while ((str = localBufferedReader3.readLine()) != null) {
            master_armor_blueprints.add(new Armor_Blueprint(str));
          }
        }
        catch (Throwable localThrowable40)
        {
          localObject2 = localThrowable40;
          throw localThrowable40;
        }
        finally {}
      }
      catch (Throwable localThrowable6)
      {
        localObject1 = localThrowable6;
        throw localThrowable6;
      }
      finally
      {
        if (localFileInputStream3 != null) {
          if (localObject1 != null) {
            try
            {
              localFileInputStream3.close();
            }
            catch (Throwable localThrowable74)
            {
              ((Throwable)localObject1).addSuppressed(localThrowable74);
            }
          } else {
            localFileInputStream3.close();
          }
        }
      }
    }
    catch (IOException localIOException3)
    {
      JOptionPane.showMessageDialog(null, localIOException3.getMessage(), localIOException3.toString(), 0);
      System.exit(1);
    }
    localFile = new File(System.getProperty("user.dir") + "\\Database\\Chassis.csv");
    try
    {
      FileInputStream localFileInputStream4 = new FileInputStream(localFile.getAbsoluteFile());
      localObject1 = null;
      try
      {
        BufferedReader localBufferedReader4 = new BufferedReader(new InputStreamReader(localFileInputStream4));
        localObject2 = null;
        try
        {
          str = null;
          localBufferedReader4.readLine();
          while ((str = localBufferedReader4.readLine()) != null) {
            master_chassis_blueprints.add(new Chassis_Blueprint(str));
          }
        }
        catch (Throwable localThrowable42)
        {
          localObject2 = localThrowable42;
          throw localThrowable42;
        }
        finally {}
      }
      catch (Throwable localThrowable8)
      {
        localObject1 = localThrowable8;
        throw localThrowable8;
      }
      finally
      {
        if (localFileInputStream4 != null) {
          if (localObject1 != null) {
            try
            {
              localFileInputStream4.close();
            }
            catch (Throwable localThrowable76)
            {
              ((Throwable)localObject1).addSuppressed(localThrowable76);
            }
          } else {
            localFileInputStream4.close();
          }
        }
      }
    }
    catch (IOException localIOException4)
    {
      JOptionPane.showMessageDialog(null, localIOException4.getMessage(), localIOException4.toString(), 0);
      System.exit(1);
    }
    localFile = new File(System.getProperty("user.dir") + "\\Database\\Cockpit.csv");
    try
    {
      FileInputStream localFileInputStream5 = new FileInputStream(localFile.getAbsoluteFile());
      localObject1 = null;
      try
      {
        BufferedReader localBufferedReader5 = new BufferedReader(new InputStreamReader(localFileInputStream5));
        localObject2 = null;
        try
        {
          str = null;
          localBufferedReader5.readLine();
          while ((str = localBufferedReader5.readLine()) != null) {
            master_cockpit_blueprints.add(new Cockpit_Blueprint(str));
          }
        }
        catch (Throwable localThrowable44)
        {
          localObject2 = localThrowable44;
          throw localThrowable44;
        }
        finally {}
      }
      catch (Throwable localThrowable10)
      {
        localObject1 = localThrowable10;
        throw localThrowable10;
      }
      finally
      {
        if (localFileInputStream5 != null) {
          if (localObject1 != null) {
            try
            {
              localFileInputStream5.close();
            }
            catch (Throwable localThrowable78)
            {
              ((Throwable)localObject1).addSuppressed(localThrowable78);
            }
          } else {
            localFileInputStream5.close();
          }
        }
      }
    }
    catch (IOException localIOException5)
    {
      JOptionPane.showMessageDialog(null, localIOException5.getMessage(), localIOException5.toString(), 0);
      System.exit(1);
    }
    localFile = new File(System.getProperty("user.dir") + "\\Database\\Engine.csv");
    try
    {
      FileInputStream localFileInputStream6 = new FileInputStream(localFile.getAbsoluteFile());
      localObject1 = null;
      try
      {
        BufferedReader localBufferedReader6 = new BufferedReader(new InputStreamReader(localFileInputStream6));
        localObject2 = null;
        try
        {
          str = null;
          localBufferedReader6.readLine();
          while ((str = localBufferedReader6.readLine()) != null) {
            master_engine_blueprints.add(new Engine_Blueprint(str));
          }
        }
        catch (Throwable localThrowable46)
        {
          localObject2 = localThrowable46;
          throw localThrowable46;
        }
        finally {}
      }
      catch (Throwable localThrowable12)
      {
        localObject1 = localThrowable12;
        throw localThrowable12;
      }
      finally
      {
        if (localFileInputStream6 != null) {
          if (localObject1 != null) {
            try
            {
              localFileInputStream6.close();
            }
            catch (Throwable localThrowable80)
            {
              ((Throwable)localObject1).addSuppressed(localThrowable80);
            }
          } else {
            localFileInputStream6.close();
          }
        }
      }
    }
    catch (IOException localIOException6)
    {
      JOptionPane.showMessageDialog(null, localIOException6.getMessage(), localIOException6.toString(), 0);
      System.exit(1);
    }
    localFile = new File(System.getProperty("user.dir") + "\\Database\\Equipment.csv");
    try
    {
      FileInputStream localFileInputStream7 = new FileInputStream(localFile.getAbsoluteFile());
      localObject1 = null;
      try
      {
        BufferedReader localBufferedReader7 = new BufferedReader(new InputStreamReader(localFileInputStream7));
        localObject2 = null;
        try
        {
          str = null;
          localBufferedReader7.readLine();
          while ((str = localBufferedReader7.readLine()) != null) {
            master_equipment_blueprints.add(new Equipment_Blueprint(str));
          }
        }
        catch (Throwable localThrowable48)
        {
          localObject2 = localThrowable48;
          throw localThrowable48;
        }
        finally {}
      }
      catch (Throwable localThrowable14)
      {
        localObject1 = localThrowable14;
        throw localThrowable14;
      }
      finally
      {
        if (localFileInputStream7 != null) {
          if (localObject1 != null) {
            try
            {
              localFileInputStream7.close();
            }
            catch (Throwable localThrowable82)
            {
              ((Throwable)localObject1).addSuppressed(localThrowable82);
            }
          } else {
            localFileInputStream7.close();
          }
        }
      }
    }
    catch (IOException localIOException7)
    {
      JOptionPane.showMessageDialog(null, localIOException7.getMessage(), localIOException7.toString(), 0);
      System.exit(1);
    }
    localFile = new File(System.getProperty("user.dir") + "\\Database\\Firecontrol.csv");
    try
    {
      FileInputStream localFileInputStream8 = new FileInputStream(localFile.getAbsoluteFile());
      localObject1 = null;
      try
      {
        BufferedReader localBufferedReader8 = new BufferedReader(new InputStreamReader(localFileInputStream8));
        localObject2 = null;
        try
        {
          str = null;
          localBufferedReader8.readLine();
          while ((str = localBufferedReader8.readLine()) != null) {
            master_firecontrol_blueprints.add(new Fire_Control_Blueprint(str));
          }
        }
        catch (Throwable localThrowable50)
        {
          localObject2 = localThrowable50;
          throw localThrowable50;
        }
        finally {}
      }
      catch (Throwable localThrowable16)
      {
        localObject1 = localThrowable16;
        throw localThrowable16;
      }
      finally
      {
        if (localFileInputStream8 != null) {
          if (localObject1 != null) {
            try
            {
              localFileInputStream8.close();
            }
            catch (Throwable localThrowable84)
            {
              ((Throwable)localObject1).addSuppressed(localThrowable84);
            }
          } else {
            localFileInputStream8.close();
          }
        }
      }
    }
    catch (IOException localIOException8)
    {
      JOptionPane.showMessageDialog(null, localIOException8.getMessage(), localIOException8.toString(), 0);
      System.exit(1);
    }
    localFile = new File(System.getProperty("user.dir") + "\\Database\\Gyro.csv");
    try
    {
      FileInputStream localFileInputStream9 = new FileInputStream(localFile.getAbsoluteFile());
      localObject1 = null;
      try
      {
        BufferedReader localBufferedReader9 = new BufferedReader(new InputStreamReader(localFileInputStream9));
        localObject2 = null;
        try
        {
          str = null;
          localBufferedReader9.readLine();
          while ((str = localBufferedReader9.readLine()) != null) {
            master_gyro_blueprints.add(new Gyro_Blueprint(str));
          }
        }
        catch (Throwable localThrowable52)
        {
          localObject2 = localThrowable52;
          throw localThrowable52;
        }
        finally {}
      }
      catch (Throwable localThrowable18)
      {
        localObject1 = localThrowable18;
        throw localThrowable18;
      }
      finally
      {
        if (localFileInputStream9 != null) {
          if (localObject1 != null) {
            try
            {
              localFileInputStream9.close();
            }
            catch (Throwable localThrowable86)
            {
              ((Throwable)localObject1).addSuppressed(localThrowable86);
            }
          } else {
            localFileInputStream9.close();
          }
        }
      }
    }
    catch (IOException localIOException9)
    {
      JOptionPane.showMessageDialog(null, localIOException9.getMessage(), localIOException9.toString(), 0);
      System.exit(1);
    }
    localFile = new File(System.getProperty("user.dir") + "\\Database\\Heatsinks.csv");
    try
    {
      FileInputStream localFileInputStream10 = new FileInputStream(localFile.getAbsoluteFile());
      localObject1 = null;
      try
      {
        BufferedReader localBufferedReader10 = new BufferedReader(new InputStreamReader(localFileInputStream10));
        localObject2 = null;
        try
        {
          str = null;
          localBufferedReader10.readLine();
          while ((str = localBufferedReader10.readLine()) != null) {
            master_heatsink_blueprints.add(new Heatsink_Blueprint(str));
          }
        }
        catch (Throwable localThrowable54)
        {
          localObject2 = localThrowable54;
          throw localThrowable54;
        }
        finally {}
      }
      catch (Throwable localThrowable20)
      {
        localObject1 = localThrowable20;
        throw localThrowable20;
      }
      finally
      {
        if (localFileInputStream10 != null) {
          if (localObject1 != null) {
            try
            {
              localFileInputStream10.close();
            }
            catch (Throwable localThrowable88)
            {
              ((Throwable)localObject1).addSuppressed(localThrowable88);
            }
          } else {
            localFileInputStream10.close();
          }
        }
      }
    }
    catch (IOException localIOException10)
    {
      JOptionPane.showMessageDialog(null, localIOException10.getMessage(), localIOException10.toString(), 0);
      System.exit(1);
    }
    localFile = new File(System.getProperty("user.dir") + "\\Database\\Jumpjet.csv");
    try
    {
      FileInputStream localFileInputStream11 = new FileInputStream(localFile.getAbsoluteFile());
      localObject1 = null;
      try
      {
        BufferedReader localBufferedReader11 = new BufferedReader(new InputStreamReader(localFileInputStream11));
        localObject2 = null;
        try
        {
          str = null;
          localBufferedReader11.readLine();
          while ((str = localBufferedReader11.readLine()) != null)
          {
            Jumpjet_Blueprint localJumpjet_Blueprint = new Jumpjet_Blueprint(str);
            master_jumpjet_blueprints.add(localJumpjet_Blueprint);
          }
        }
        catch (Throwable localThrowable56)
        {
          localObject2 = localThrowable56;
          throw localThrowable56;
        }
        finally {}
      }
      catch (Throwable localThrowable22)
      {
        localObject1 = localThrowable22;
        throw localThrowable22;
      }
      finally
      {
        if (localFileInputStream11 != null) {
          if (localObject1 != null) {
            try
            {
              localFileInputStream11.close();
            }
            catch (Throwable localThrowable90)
            {
              ((Throwable)localObject1).addSuppressed(localThrowable90);
            }
          } else {
            localFileInputStream11.close();
          }
        }
      }
    }
    catch (IOException localIOException11)
    {
      JOptionPane.showMessageDialog(null, localIOException11.getMessage(), localIOException11.toString(), 0);
      System.exit(1);
    }
    localFile = new File(System.getProperty("user.dir") + "\\Database\\Misc.csv");
    try
    {
      FileInputStream localFileInputStream12 = new FileInputStream(localFile.getAbsoluteFile());
      localObject1 = null;
      try
      {
        BufferedReader localBufferedReader12 = new BufferedReader(new InputStreamReader(localFileInputStream12));
        localObject2 = null;
        try
        {
          str = null;
          str = localBufferedReader12.readLine();
          User.mwo_stage = str.split(";")[0];
        }
        catch (Throwable localThrowable58)
        {
          localObject2 = localThrowable58;
          throw localThrowable58;
        }
        finally {}
      }
      catch (Throwable localThrowable24)
      {
        localObject1 = localThrowable24;
        throw localThrowable24;
      }
      finally
      {
        if (localFileInputStream12 != null) {
          if (localObject1 != null) {
            try
            {
              localFileInputStream12.close();
            }
            catch (Throwable localThrowable92)
            {
              ((Throwable)localObject1).addSuppressed(localThrowable92);
            }
          } else {
            localFileInputStream12.close();
          }
        }
      }
    }
    catch (IOException localIOException12)
    {
      JOptionPane.showMessageDialog(null, localIOException12.getMessage(), localIOException12.toString(), 0);
      System.exit(1);
    }
    localFile = new File(System.getProperty("user.dir") + "\\Database\\Model.csv");
    try
    {
      FileInputStream localFileInputStream13 = new FileInputStream(localFile.getAbsoluteFile());
      localObject1 = null;
      try
      {
        BufferedReader localBufferedReader13 = new BufferedReader(new InputStreamReader(localFileInputStream13));
        localObject2 = null;
        try
        {
          str = null;
          localBufferedReader13.readLine();
          while ((str = localBufferedReader13.readLine()) != null) {
            master_model_blueprints.add(new Model_Blueprint(str));
          }
        }
        catch (Throwable localThrowable60)
        {
          localObject2 = localThrowable60;
          throw localThrowable60;
        }
        finally {}
      }
      catch (Throwable localThrowable26)
      {
        localObject1 = localThrowable26;
        throw localThrowable26;
      }
      finally
      {
        if (localFileInputStream13 != null) {
          if (localObject1 != null) {
            try
            {
              localFileInputStream13.close();
            }
            catch (Throwable localThrowable94)
            {
              ((Throwable)localObject1).addSuppressed(localThrowable94);
            }
          } else {
            localFileInputStream13.close();
          }
        }
      }
    }
    catch (IOException localIOException13)
    {
      JOptionPane.showMessageDialog(null, localIOException13.getMessage(), localIOException13.toString(), 0);
      System.exit(1);
    }
    localFile = new File(System.getProperty("user.dir") + "\\Database\\Module.csv");
    try
    {
      FileInputStream localFileInputStream14 = new FileInputStream(localFile.getAbsoluteFile());
      localObject1 = null;
      try
      {
        BufferedReader localBufferedReader14 = new BufferedReader(new InputStreamReader(localFileInputStream14));
        localObject2 = null;
        try
        {
          str = null;
          localBufferedReader14.readLine();
          while ((str = localBufferedReader14.readLine()) != null) {
            master_module_blueprints.add(new Module_Blueprint(str));
          }
        }
        catch (Throwable localThrowable62)
        {
          localObject2 = localThrowable62;
          throw localThrowable62;
        }
        finally {}
      }
      catch (Throwable localThrowable28)
      {
        localObject1 = localThrowable28;
        throw localThrowable28;
      }
      finally
      {
        if (localFileInputStream14 != null) {
          if (localObject1 != null) {
            try
            {
              localFileInputStream14.close();
            }
            catch (Throwable localThrowable96)
            {
              ((Throwable)localObject1).addSuppressed(localThrowable96);
            }
          } else {
            localFileInputStream14.close();
          }
        }
      }
    }
    catch (IOException localIOException14)
    {
      JOptionPane.showMessageDialog(null, localIOException14.getMessage(), localIOException14.toString(), 0);
      System.exit(1);
    }
    localFile = new File(System.getProperty("user.dir") + "\\Database\\Section.csv");
    try
    {
      FileInputStream localFileInputStream15 = new FileInputStream(localFile.getAbsoluteFile());
      localObject1 = null;
      try
      {
        BufferedReader localBufferedReader15 = new BufferedReader(new InputStreamReader(localFileInputStream15));
        localObject2 = null;
        try
        {
          str = null;
          localBufferedReader15.readLine();
          while ((str = localBufferedReader15.readLine()) != null) {
            master_section_blueprints.add(new Section_Blueprint(str));
          }
        }
        catch (Throwable localThrowable64)
        {
          localObject2 = localThrowable64;
          throw localThrowable64;
        }
        finally {}
      }
      catch (Throwable localThrowable30)
      {
        localObject1 = localThrowable30;
        throw localThrowable30;
      }
      finally
      {
        if (localFileInputStream15 != null) {
          if (localObject1 != null) {
            try
            {
              localFileInputStream15.close();
            }
            catch (Throwable localThrowable98)
            {
              ((Throwable)localObject1).addSuppressed(localThrowable98);
            }
          } else {
            localFileInputStream15.close();
          }
        }
      }
    }
    catch (IOException localIOException15)
    {
      JOptionPane.showMessageDialog(null, localIOException15.getMessage(), localIOException15.toString(), 0);
      System.exit(1);
    }
    localFile = new File(System.getProperty("user.dir") + "\\Database\\Structure.csv");
    try
    {
      FileInputStream localFileInputStream16 = new FileInputStream(localFile.getAbsoluteFile());
      localObject1 = null;
      try
      {
        BufferedReader localBufferedReader16 = new BufferedReader(new InputStreamReader(localFileInputStream16));
        localObject2 = null;
        try
        {
          str = null;
          localBufferedReader16.readLine();
          while ((str = localBufferedReader16.readLine()) != null) {
            master_structure_blueprints.add(new Structure_Blueprint(str));
          }
        }
        catch (Throwable localThrowable66)
        {
          localObject2 = localThrowable66;
          throw localThrowable66;
        }
        finally {}
      }
      catch (Throwable localThrowable32)
      {
        localObject1 = localThrowable32;
        throw localThrowable32;
      }
      finally
      {
        if (localFileInputStream16 != null) {
          if (localObject1 != null) {
            try
            {
              localFileInputStream16.close();
            }
            catch (Throwable localThrowable100)
            {
              ((Throwable)localObject1).addSuppressed(localThrowable100);
            }
          } else {
            localFileInputStream16.close();
          }
        }
      }
    }
    catch (IOException localIOException16)
    {
      JOptionPane.showMessageDialog(null, localIOException16.getMessage(), localIOException16.toString(), 0);
      System.exit(1);
    }
    localFile = new File(System.getProperty("user.dir") + "\\Database\\Weapon.csv");
    try
    {
      FileInputStream localFileInputStream17 = new FileInputStream(localFile.getAbsoluteFile());
      localObject1 = null;
      try
      {
        BufferedReader localBufferedReader17 = new BufferedReader(new InputStreamReader(localFileInputStream17));
        localObject2 = null;
        try
        {
          str = null;
          localBufferedReader17.readLine();
          while ((str = localBufferedReader17.readLine()) != null) {
            master_weapon_blueprints.add(new Weapon_Blueprint(str));
          }
        }
        catch (Throwable localThrowable68)
        {
          localObject2 = localThrowable68;
          throw localThrowable68;
        }
        finally {}
      }
      catch (Throwable localThrowable34)
      {
        localObject1 = localThrowable34;
        throw localThrowable34;
      }
      finally
      {
        if (localFileInputStream17 != null) {
          if (localObject1 != null) {
            try
            {
              localFileInputStream17.close();
            }
            catch (Throwable localThrowable102)
            {
              ((Throwable)localObject1).addSuppressed(localThrowable102);
            }
          } else {
            localFileInputStream17.close();
          }
        }
      }
    }
    catch (IOException localIOException17)
    {
      System.err.println(localIOException17);
      System.exit(1);
    }
  }
  
  public static void Set_Selected_Models(String paramString)
  {
    selected_model_blueprints.clear();
    Iterator localIterator = master_model_blueprints.iterator();
    while (localIterator.hasNext())
    {
      Model_Blueprint localModel_Blueprint = (Model_Blueprint)localIterator.next();
      if (localModel_Blueprint.chassis_name.equals(paramString)) {
        selected_model_blueprints.add(localModel_Blueprint);
      }
    }
  }
  
  public static void Set_Selected_Sections(String paramString)
  {
    for (int i = 0; i < 8; i++) {
      selected_section_blueprints[i].clear();
    }
    for (i = 0; i < 8; i++)
    {
      Iterator localIterator = master_section_blueprints.iterator();
      while (localIterator.hasNext())
      {
        Section_Blueprint localSection_Blueprint = (Section_Blueprint)localIterator.next();
        if ((localSection_Blueprint.chassis.equals(paramString)) && (localSection_Blueprint.section.equals(Constants.sectionNames[i]))) {
          selected_section_blueprints[i].add(localSection_Blueprint);
        }
      }
    }
  }
  
  public static void Set_Selected_Components(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    selected_engine_blueprints.clear();
    selected_gyro_blueprints.clear();
    selected_armor_blueprints.clear();
    selected_structure_blueprints.clear();
    selected_heatsink_blueprints.clear();
    selected_cockpit_blueprints.clear();
    selected_jumpjet_blueprints.clear();
    selected_firecontrol_blueprints.clear();
    Iterator localIterator = master_engine_blueprints.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (Engine_Blueprint)localIterator.next();
      if (Is_Compatible(((Engine_Blueprint)localObject).tech_base, paramString, ((Engine_Blueprint)localObject).id, paramBoolean1, paramBoolean2)) {
        selected_engine_blueprints.add(localObject);
      }
    }
    localIterator = master_armor_blueprints.iterator();
    while (localIterator.hasNext())
    {
      localObject = (Armor_Blueprint)localIterator.next();
      if (Is_Compatible(((Armor_Blueprint)localObject).tech_base, paramString, ((Armor_Blueprint)localObject).id, paramBoolean1, paramBoolean2)) {
        selected_armor_blueprints.add(localObject);
      }
    }
    localIterator = master_heatsink_blueprints.iterator();
    while (localIterator.hasNext())
    {
      localObject = (Heatsink_Blueprint)localIterator.next();
      if (Is_Compatible(((Heatsink_Blueprint)localObject).tech_base, paramString, ((Heatsink_Blueprint)localObject).id, paramBoolean1, paramBoolean2)) {
        selected_heatsink_blueprints.add(localObject);
      }
    }
    localIterator = master_gyro_blueprints.iterator();
    while (localIterator.hasNext())
    {
      localObject = (Gyro_Blueprint)localIterator.next();
      if (Is_Compatible(((Gyro_Blueprint)localObject).tech_base, paramString, ((Gyro_Blueprint)localObject).id, paramBoolean1, paramBoolean2)) {
        selected_gyro_blueprints.add(localObject);
      }
    }
    localIterator = master_structure_blueprints.iterator();
    while (localIterator.hasNext())
    {
      localObject = (Structure_Blueprint)localIterator.next();
      if (Is_Compatible(((Structure_Blueprint)localObject).tech_base, paramString, ((Structure_Blueprint)localObject).id, paramBoolean1, paramBoolean2)) {
        selected_structure_blueprints.add(localObject);
      }
    }
    localIterator = master_cockpit_blueprints.iterator();
    while (localIterator.hasNext())
    {
      localObject = (Cockpit_Blueprint)localIterator.next();
      if (Is_Compatible(((Cockpit_Blueprint)localObject).tech_base, paramString, ((Cockpit_Blueprint)localObject).id, paramBoolean1, paramBoolean2)) {
        selected_cockpit_blueprints.add(localObject);
      }
    }
    localIterator = master_jumpjet_blueprints.iterator();
    while (localIterator.hasNext())
    {
      localObject = (Jumpjet_Blueprint)localIterator.next();
      if (Is_Compatible(((Jumpjet_Blueprint)localObject).tech_base, paramString, ((Jumpjet_Blueprint)localObject).id, paramBoolean1, paramBoolean2)) {
        selected_jumpjet_blueprints.add(localObject);
      }
    }
    localIterator = master_firecontrol_blueprints.iterator();
    while (localIterator.hasNext())
    {
      localObject = (Fire_Control_Blueprint)localIterator.next();
      if (Is_Compatible(((Fire_Control_Blueprint)localObject).tech_base, paramString, ((Fire_Control_Blueprint)localObject).id, paramBoolean1, paramBoolean2)) {
        selected_firecontrol_blueprints.add(localObject);
      }
    }
  }
  
  public static void Set_Selected_Equipment(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    selected_ammo_blueprints.clear();
    selected_equipment_blueprints.clear();
    for (int i = 0; i < 3; i++) {
      selected_weapon_blueprints[i].clear();
    }
    Iterator localIterator = master_ammo_blueprints.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (Ammo_Blueprint)localIterator.next();
      if (Is_Compatible(((Ammo_Blueprint)localObject).tech_base, paramString, ((Ammo_Blueprint)localObject).id, paramBoolean1, paramBoolean2)) {
        selected_ammo_blueprints.add(localObject);
      }
    }
    localIterator = master_equipment_blueprints.iterator();
    while (localIterator.hasNext())
    {
      localObject = (Equipment_Blueprint)localIterator.next();
      if (Is_Compatible(((Equipment_Blueprint)localObject).tech_base, paramString, ((Equipment_Blueprint)localObject).id, paramBoolean1, paramBoolean2)) {
        selected_equipment_blueprints.add(localObject);
      }
    }
    localIterator = master_weapon_blueprints.iterator();
    while (localIterator.hasNext())
    {
      localObject = (Weapon_Blueprint)localIterator.next();
      if (Is_Compatible(((Weapon_Blueprint)localObject).tech_base, paramString, ((Weapon_Blueprint)localObject).id, paramBoolean1, paramBoolean2))
      {
        for (i = 0; (i < 3) && (!Constants.HARDPOINT_TYPES[i].equals(((Weapon_Blueprint)localObject).hardpoint_type)); i++) {}
        if (i < 3) {
          selected_weapon_blueprints[i].add(localObject);
        }
      }
    }
  }
  
  public static void Set_Selected_Blueprints(Chassis_Blueprint paramChassis_Blueprint, boolean paramBoolean1, boolean paramBoolean2)
  {
    Set_Selected_Models(paramChassis_Blueprint.chassis_name);
    Set_Selected_Sections(paramChassis_Blueprint.chassis_name);
    Set_Selected_Components(paramChassis_Blueprint.tech_base, paramBoolean1, paramBoolean2);
    Set_Selected_Equipment(paramChassis_Blueprint.tech_base, paramBoolean1, paramBoolean2);
    queued_items.clear();
  }
  
  public static boolean Is_Time_Compatible(int paramInt, boolean paramBoolean)
  {
    return (paramBoolean) || (paramInt >= 0);
  }
  
  public static boolean Is_Base_Compatible(String paramString1, String paramString2, boolean paramBoolean)
  {
    return (paramBoolean) || (paramString1.equals(paramString2)) || (paramString1.equals("ALL"));
  }
  
  public static boolean Is_Compatible(String paramString1, String paramString2, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    return (Is_Base_Compatible(paramString1, paramString2, paramBoolean2)) && (Is_Time_Compatible(paramInt, paramBoolean1));
  }
}


/* Location:              C:\Users\Trevin\Dropbox\Public\MWO Mechbay.zip!\MWO_Mechbay.jar!\Utility\Database.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */