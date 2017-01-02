package com.github.majora_incarnate.mwo_mechbay.parser;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/**
 * @author Trevin
 */
public class Reader {
    public final ZipFile pakFile;
    public final ZipInputStream pakStream;

    public Reader(final String pakFilePath) {
        try {
            pakFile = new ZipFile(pakFilePath);
            pakStream = new ZipInputStream(new FileInputStream(pakFilePath));
        } catch (IOException e) {
            System.err.println(String.format("Error opening: %s", pakFilePath));
            throw new RuntimeException(e);
        }
    }

    public String[] read(final String... files) {
        final ArrayList<String> fileList = new ArrayList<>(Arrays.asList(files));
        final String[] textOfFiles = new String[fileList.size()];

        try {
            for (int i = 0; i < fileList.size(); i++) {
                ZipEntry entry = pakFile.getEntry(files[i]);

                fileList.contains(entry.getName());
                BufferedReader reader = new BufferedReader(new InputStreamReader(pakFile.getInputStream(entry)));
                StringBuilder stringBuilder = new StringBuilder();

                while (reader.ready())
                    stringBuilder.append(reader.readLine());

                textOfFiles[i] = stringBuilder.toString();
            }
        } catch (IOException e) {
            //throw new RuntimeException(e);
        }

        return textOfFiles;
    }

    public void cleanup() {
        try {
            pakStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}