package LessonTwentyEight;

import java.io.File;
import java.util.Scanner;

//list    -> печатает все папки и файлы +
//files   -> печатает все файлы +
//folders -> печатает все папки +
//cd path -> переходить в указанный путь
//cd ..   -> переходить на шаг назад
public class InputOutput {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String currentPath = "C:\\Users\\Public\\Documents";
        System.out.println("list    -> печатает все папки и файлы" +
                "files   -> печатает все файлы" +
                "folders -> печатает все папки" +
                "cd path -> переходить в указанный путь" +
                "cd ..   -> переходить на шаг назад");

        while (true) {
            System.out.print(currentPath + " : ");
            String command = input.nextLine();
            if (command.equals("list")) {
                File file = new File(currentPath);
                File[] contents = file.listFiles();
                try {
                    if (contents != null) {
                        for (File item : contents) {
                            if (item.isDirectory()) {
                                System.out.println("📁 " + item.getName());
                            } else {
                                System.out.println("📝 " + item.getName());
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Ошибка");
                }
            } else if (command.equals("files")) {
                File file = new File(currentPath);
                File[] files = file.listFiles();
                try {
                    if (files != null) {
                        for (File file1 : files) {
                            if (file1.isFile()) {
                                System.out.println("📝 " + file1.getName());
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Ошибка");
                }
            } else if (command.equals("folders")) {
                File file = new File(currentPath);
                File[] folder = file.listFiles();
                try {
                    if (folder != null) {
                        for (File folderes : folder) {
                            if (folderes.isDirectory()) {
                                System.out.println("📁 " + folderes.getName());
                            }
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Ошибка");
                }

            } else if (command.startsWith("cd ")) {
                String newPath = command.substring(3);
                File newDir = new File(currentPath, newPath);

                if (newDir.exists() && newDir.isDirectory()) {
                    currentPath = newDir.getPath();
                    System.out.println("Перешли в: " + currentPath);
                } else {
                    System.out.println("Папка не найдена: " + newPath);
                }
            } else if (command.equals("cd..")) {
                File file = new File(currentPath);
                String rout = file.getParent();
                if (rout != null) {
                    currentPath = rout.toString();
                    System.out.println("Родительский каталог: " + currentPath);
                } else {
                    System.out.println("Нет родительского каталога");
                }
            } else if (command.equals("exit")) {
            System.out.println("Выход из программы");
            break;

        } else {
            System.out.println("Неизвестная команда. Доступные: list, files, folders, cd .., cd <путь>");
        }

            System.out.print(currentPath + " : ");
        }

        //        String root = "D:\\";
//        File rootFile = new File(root);
//
//        int count = 0;
//        for (File file : rootFile.listFiles()) {
//            if (file.isFile()) {
//                System.out.println("📝 " + file.getName());
//            }
//            if (file.isDirectory()) {
//                System.out.println("📁 " + file.getName());
//                File[] files = file.listFiles();
//               try {
//                   for (File f : files) {
//                       System.out.print("--");
//                       if (f.isFile()) {
//                           System.out.println("📝 " + f.getName());
//                       }
//                       if (f.isDirectory()) {
//                           System.out.println("📁 " + f.getName());
//
//                           try {
//                               for (File fs : f.listFiles()) {
//                                   System.out.print("----");
//                                   if (fs.isFile()) {
//                                       System.out.println("📝 " + fs.getName());
//                                   }
//                                   if (fs.isDirectory()) {
//                                       System.out.println("📁 " + fs.getName());
//                                   }
//                               }
//                           }catch (Exception e) {}
//                       }
//                   }
//               }catch (Exception e) {}
//            }
//        }


        //File
        //Folder

//        File file = new File("C:\\Users\\f-abd\\Desktop\\9999999999999999999");

//        file.mkdirs();           // sozdaet podpapki
//        file.createNewFile();    // sozdaet file
//        file.mkdir();            // sozdaet folder
//        file.exists()            // suwestvuet li dannaya papka / file
//        file.delete()            // udalit file ili papku esli tolko papka pusta
//        file.isDirectory()       // danniy obyekt folder?
//        file.isFile()            // danniy obyekt file?
//        renameTo()               // peremestin , pereimenovat
//        getName())               // vernut nazvanie file / folder
//        isHidden())              // file / folder skrit ili net
//        isAbsolute()             // eto absolutniy put ili net
//        canExecute()             // mojno vipolnit
//        canRead()                // mojno scitat
//        getAbsoluteFile()        // verni absolutniy put
//        length()                 // razmer file / folder
//        getPath()                // put kotoriy bil propisan
//        getAbsolutePath()        // polniy put
//        getParent()              // Roditelskaya papka
//        lastModified()           // Vremya posledneqo izmineniya
//        list()                   // vernut spisok imen failov / papok
//        listFiles()              // vernut  faili i papki


//        File folder = new File("text");
//
//        System.out.println(folder.getAbsolutePath());
//        System.out.println(folder.getAbsoluteFile());
//        folder.setWritable(true);
//        File[] list = folder.listFiles();

//        for(File word : list){
//            System.out.println(word.getName());
//        }


//        File folder = new File("words");
//
//        String[] list = folder.list();
//
//        for(String word : list){
//            System.out.println(word);
//        }

//        File folder = new File("words");
//
//        String[] list = folder.list();
//
//        for(String word : list){
//            System.out.println(word);
//        }


//        File fileOld = new File("farid.txt");
//        File fileNew = new File("words/farid.txt");
//
//        fileOld.renameTo(fileNew);


//        File fileOld = new File("text.txt");
//        File fileNew = new File("farid.txt");
//
//        fileOld.renameTo(fileNew);

//        file.createNewFile();

//        System.out.println(file.getName());
//        System.out.println(file.isHidden());
//        System.out.println(file.isAbsolute());
//        System.out.println(file.canExecute());
//        System.out.println(file.canRead());
//        System.out.println(file.getAbsoluteFile());
//        System.out.println(file.length());

//        File file = new File("words");
//
//        file.mkdir();
//
//        if (file.isDirectory()){
//            System.out.println("This is folder");
//        }else{
//            System.out.println("This is file");
//        }

//        if (file.isFile()){
//            System.out.println("This is file");
//        }else{
//            System.out.println("This is folder");
//        }

//        File file = new File("words/a");
//
////        file.mkdir();
//       if ( file.delete()){
//           System.out.println("Udalil");
//       }else{
//           System.out.println("Netu file / folder");
//       }


//        File file = new File("words.txt");

//        file.createNewFile();
//
////        file.delete();
//
//
//        if (file.exists()) {
//            System.out.println("Da");
//        }else{
//            System.out.println("Net");
//        }
//        file.delete();


//        for (int i = 0; i < 10; i++) {
//             file = new File("words"+i);
//            file.mkdir();
//        }


//        for (int i = 0; i < 1; i++) {
//            File file = new File("words"+i+".png");
//            file.createNewFile();
//        }


    }

}
