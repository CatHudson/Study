package ru.geekbrains.lesson09;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesJoin {

    public static void filesJoin (Path repository, Path filesToJoin) throws IOException {
        Files.createFile(filesToJoin);
        BufferedWriter writer = Files.newBufferedWriter(filesToJoin, StandardCharsets.UTF_8);
        for (File file : repository.toFile().listFiles()) {
            if (!file.isDirectory()) {
                Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8).transferTo(writer);
            }
        }
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        filesJoin(Path.of("D:\\testdir"), Path.of("test.txt"));
    }
}
