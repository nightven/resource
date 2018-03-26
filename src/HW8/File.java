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

import java.nio.file.Path;
import java.nio.file.Paths;

public class File {


    public static void main(String[] args) {
        String expansion = ".java";
        int depth;
        int countFiles = 0;

        File folder = new File("E:\\\java_lessons\\\src\\\HW6");

        //Path path = Paths.get("E:\\java_lessons\\src\\HW6");

    }

    //метод возвращает количество файлов с заданым расширением в указаной дериктории
    public static void getSumFileAtDir(){

        if(folder.)


    }

//    //метод вернет файлы с расширением java. Задана глубина и путь откуда искать
//    public File getFile_java(Path path, int depth){
//        return
//    }

//    //метод выведет в консоль конкатинированую строку всех названий файлов
//    public void FileNameConcat(){
//
//    }
}
