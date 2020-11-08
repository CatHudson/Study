package ru.geekbrains.lesson09;

import java.io.File;
import java.util.Objects;

public class DeleteDir {

    public static void deleteDir(String path) {
        File file = new File(path);
        if (!file.exists())
            return;

        if (file.isDirectory()) {
            for (File f : Objects.requireNonNull(file.listFiles())) {
                deleteDir(f.getPath());
            }
        }
        file.delete();
    }

    public static void main(String[] args) {
        deleteDir("D:\\testdir");
    }
}
