package ru.geekbrains.lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Count {

    public static int count (Path path, String phrase) throws IOException {

        BufferedReader reader = Files.newBufferedReader(path);

        StringBuilder str = new StringBuilder();
        int count = 0;
        int nextChar = 0;
        do {
            if (str.length() < phrase.length()) {
                str.append((char) nextChar);
                continue;
            } else {
                if (str.toString().equals(phrase)) {
                    count++;
                }
                str.deleteCharAt(0);
                str.append((char) nextChar);
            }
        } while ((nextChar = reader.read()) != -1);
        return count;
    }

    public static void main(String[] args) throws IOException {

        System.out.println(count(Path.of("D:\\testfile.txt"), "Cat"));
    }
}
