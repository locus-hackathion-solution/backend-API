package com.blume.locus.hackathontimeapi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utility {

    public static String readFile(String filepath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
