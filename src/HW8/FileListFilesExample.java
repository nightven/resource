package HW8;
/*
Задание:

Написать метод, который принимает директорию, и расширения файла.
Подсчитать общее количество файлов с заданным расширением рекурсивно начиная от этой директории.

Одна из целей: потренироваться писать рекурсивные методы.


Практиковаться с классом Files. Разобраться в отличии Files.find, Files.walk + filter, Files.list

Найти файлы с расширением .java
В методе принимается инт глубины поиска
Пас, откуда искать
Вывести в консоль конкатенированую строку всех названий файлов

 */


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.*;

public class FileListFilesExample {

    public static void main(String[] args) throws IOException {
        String expansion = ".java";
        String p = "E:\\java_lessons\\src\\HW6";
        int depth = 3;
        int countFiles = 0;
        File directory = new File("E:\\java_lessons\\src\\HW6");
        Path path = Paths.get(p);

        System.out.println("в каталоге " + p + "  найдено " + getSumFileAtDir(directory,countFiles) + " файлов");
        System.out.println();

        getFile_java(p,depth,expansion);

    }

    //метод возвращает количество файлов  в указаной дериктории
    public static int getSumFileAtDir(File directory, int countFiles){  // не могу никак обсчитать рекурсию(( в голову
        for (File f: directory.listFiles()) {                           //ничего не лезет.4 часа уже мучаюсь с этим.
            if(f.isDirectory()) {
                getSumFileAtDir(f,countFiles);
                continue;
            }
            else countFiles++;

        }

        return countFiles;
    }

//    //метод выведет конкатенированую строку с  файлы с расширением java. Задана глубина и путь откуда искать.
    public static void  getFile_java(String p, int depth, String expansion ) throws IOException {
        Path start = Paths.get(p);
        try (Stream<Path> stream = Files.find(start, depth, (path, attr) ->{
            return String.valueOf(path).endsWith(expansion);}))
        {
            String joined = stream.sorted().map(String::valueOf).collect(Collectors.joining(": "));
            System.out.println("Найдены такие файлы: \n" + joined);
        }
    }



}
