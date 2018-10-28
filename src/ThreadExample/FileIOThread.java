package ThreadExample;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileIOThread {

    public static void main(String[] args) throws InterruptedException {
//        ArrayList<Path> fileNameList = new ArrayList<>();
//        try (DirectoryStream<Path> entries = Files.newDirectoryStream(Paths.get("C:\\Users\\admin\\Documents\\FileInput"))) {
//            for (Path path : entries) {
//                System.out.println("File(s) in FileInput folder: " + path.getFileName());
//                fileNameList.add(path.getFileName());
//            }
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        for (Path fileName : fileNameList) {
//            int count = 0;
//            try (FileInputStream fin = new FileInputStream("C:\\Users\\admin\\Documents\\FileInput\\" + fileName);
//                 FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Documents\\FileOutput\\" + fileName)) {
//
//                ArrayList<String> arrWft = new ArrayList<>();
//                Scanner sc = new Scanner(fin);
//                while (sc.hasNext()) {
//                    String wordFromTextFile = sc.next();
//                    arrWft.add(wordFromTextFile);
//                    count++;
//                }
//                String text = "Number of words in " + fileName + ": " + count;
//                System.out.println(text);
//
//                String strArrEft = String.join(" ", arrWft);
//                String strFileText = strArrEft.toLowerCase();
//                String[] strFText = strFileText.split("[(' ')?!:;,.-]");
//                HashMap<String, Integer> fileUniques = new HashMap<String, Integer>();
//                for (String word : strFText) {
//                    if (word.length() <= 2) {
//                        continue;
//                    }
//                    Integer existingCount = fileUniques.get(word);
//                    fileUniques.put(word, (existingCount == null ? 1 : (existingCount + 1)));
//                }
//                Set<Map.Entry<String, Integer>> uniqueSet = fileUniques.entrySet();
//                ArrayList<String> reslist = new ArrayList<>();
//                for (Map.Entry<String, Integer> entry : uniqueSet) {
//                    if (entry.getValue() >= 1) {
////                    System.out.println(entry.getKey() + " - " + entry.getValue());
//                        reslist.add(entry.getKey() + " - " + entry.getValue());
//                    }
//                }
//                String fText = String.join(", ", reslist);
//
//                byte[] buffer = fText.getBytes();
//                fos.write(buffer, 0, buffer.length);
//                System.out.println("The file has been written");
//
//            } catch (IOException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
        //////////////////////////////////////////////////////////////////////////////////////////////////////

        new MyThread().start();
//        new MyThread().join();
        new MyThread().start();
//        new MyThread().join();
        new MyThread().start();
//        new MyThread().join();
//        new MyThread().start();
//        new MyThread().join();
//        new MyThread().start();
//        new MyThread().join();

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        ArrayList<Path> fileNameList = new ArrayList<>();
        try (DirectoryStream<Path> entries = Files.newDirectoryStream(Paths.get("C:\\Users\\admin\\Documents\\FileInput"))) {
            for (Path path : entries) {
//                System.out.println("File(s) in FileInput folder: " + path.getFileName());
                fileNameList.add(path.getFileName());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        for (Path fileName : fileNameList) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            int count = 0;
            try (FileInputStream fin = new FileInputStream("C:\\Users\\admin\\Documents\\FileInput\\" + fileName);
                 FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Documents\\FileOutput\\" + fileName)) {

                ArrayList<String> arrWft = new ArrayList<>();
                Scanner sc = new Scanner(fin);
                while (sc.hasNext()) {
                    String wordFromTextFile = sc.next();
                    arrWft.add(wordFromTextFile);
                    count++;
                }
                String text = "Number of words in " + fileName + ": " + count;
                System.out.println(text);

                String strArrEft = String.join(" ", arrWft);
                String strFileText = strArrEft.toLowerCase();
                String[] strFText = strFileText.split("[(' ')?!:;,.-]");
                HashMap<String, Integer> fileUniques = new HashMap<String, Integer>();
                for (String word : strFText) {
                    if (word.length() <= 2) {
                        continue;
                    }
                    Integer existingCount = fileUniques.get(word);
                    fileUniques.put(word, (existingCount == null ? 1 : (existingCount + 1)));
                }
                Set<Map.Entry<String, Integer>> uniqueSet = fileUniques.entrySet();
                ArrayList<String> reslist = new ArrayList<>();
                for (Map.Entry<String, Integer> entry : uniqueSet) {
                    if (entry.getValue() >= 1) {
//                    System.out.println(entry.getKey() + " - " + entry.getValue());
                        reslist.add(entry.getKey() + " - " + entry.getValue());
                    }
                }
                String fText = String.join(", ", reslist);

                byte[] buffer = fText.getBytes();
                fos.write(buffer, 0, buffer.length);
//                System.out.println("The file " + fileName + " has been written");
                System.out.println("The file " + fileName + " has been written by " + Thread.currentThread().getName());

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
//        System.out.println("Thread name is - " + Thread.currentThread().getName());
    }
}
