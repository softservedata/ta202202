package com.softserve.edu.hw13;

import java.io.*;

public class homework13 {
    public static void main(String[] args) {
        modifyFile("src/com/softserve/edu/hw13/testfile.txt", "Welcome", "Hello");
        System.out.println("job's done");
    }

    static void modifyFile(String path, String oldString, String newString) {

        File file = new File(path);
        StringBuilder oldContent = new StringBuilder();
        BufferedReader reader = null;
        FileWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();

            while (line != null) {
                oldContent.append(line).append(System.lineSeparator());
                line = reader.readLine();
            }

            String newContent = oldContent.toString().replaceAll(oldString, newString);
            writer = new FileWriter(file);
            writer.write(newContent);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null && writer != null) {
                    reader.close();
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
