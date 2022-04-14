package com;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public class Encoder {

    public static void main(String[] args) {
        if (copyFilesUsingStream("src/com/utf8.txt", "UTF-8", "src/com/win1251.txt", "WINDOWS-1251")) {
            System.out.println("File was  successfully encoded");
        } else {
            System.out.println("File is not created");
        }


    }

    public static boolean copyFilesUsingStream(String source, String sourceEnc, String dest, String descEnc) {

        Charset sEnc = null;
        try {
            sEnc = Charset.forName(sourceEnc);
        } catch (UnsupportedCharsetException e) {
            System.out.println("There is a problem with Input file encoding");
            return false;
        }
        Charset dEnc = null;
        try {
            dEnc = Charset.forName(descEnc);
        } catch (UnsupportedCharsetException e) {
            System.out.println("There is a problem with Input file encoding");
            return false;
        }

        Reader fis = null;
        try {
            fis = new InputStreamReader(new FileInputStream(source), sEnc);
        } catch (FileNotFoundException e) {
            System.out.println("There is a problem with Input File");
            return false;
        }
        Writer fos = null;
        try {
            fos = new OutputStreamWriter(new FileOutputStream(dest), dEnc);
        } catch (FileNotFoundException e) {
            System.out.println("There is a problem with Output File");
            return false;
        }
        char[] buffer = new char[1024];
        int lenght;

        try {

            while ((lenght = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, lenght);
            }


        } catch (IOException e) {
            System.out.println();
            return false;

        } finally {

            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                System.out.println("There is a problem with file closing");
            }
        }
        return true;

    }

}
