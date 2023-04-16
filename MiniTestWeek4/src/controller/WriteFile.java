package controller;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class WriteFile {
    static public<K,V> void writeToFile(String name, String value) {
        try {
            FileOutputStream os = new FileOutputStream(name);
            DataOutputStream objs = new DataOutputStream(os);
            //write to file
            objs.writeBytes(value);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
