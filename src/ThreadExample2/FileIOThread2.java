package ThreadExample2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileIOThread2 {
    public static void main(String[] args) {

        MyThread1 myThread1 = new MyThread1();
        MyThread1 myThread2 = new MyThread1();
        MyThread1 myThread3 = new MyThread1();
        myThread1.start();
        myThread2.start();
        myThread3.start();

    }
}

class MyThread1 extends Thread {
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


        try {
            Files.walk(Paths.get("C:\\Users\\admin\\Documents\\FileOutput\\"))
                    .filter(Files::isRegularFile)
                    .map(Path::toFile)
                    .forEach(File::delete);
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

                synchronized (this) {
                    while (sc.hasNext()) {
                        String wordFromTextFile = sc.next();
                        arrWft.add(wordFromTextFile);
                        count++;
                    }
//                }

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
                            reslist.add(entry.getKey() + " - " + entry.getValue());
                        }
                    }
                    String fText = String.join(", ", reslist);

                    byte[] buffer = fText.getBytes();
                    fos.write(buffer, 0, buffer.length);
                    System.out.println("The file " + fileName + " has been written by " + Thread.currentThread().getName());
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
}
