//package ThreadExample2;
//
//import java.io.*;
//import java.util.*;
//import java.util.concurrent.BlockingQueue;
//
//public class ReaderThread implements Runnable {
//
//    protected BlockingQueue<String> blockingQueue = null;
//
//    public ReaderThread(BlockingQueue<String> blockingQueue) {
//        this.blockingQueue = blockingQueue;
//    }
//
//    @Override
//    public void run() {
//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new FileReader(new File("C:\\Users\\admin\\Documents\\FileInput\\text.txt")));
//
////            String buffer = null;
////            while ((buffer = br.readLine()) != null) {
////                blockingQueue.put(buffer);
////            }
////            blockingQueue.put("EOF");  //When end of file has been reached
//
//
//            ArrayList<String> arrWft = new ArrayList<>();
//            Scanner sc = new Scanner(br);
//            while (sc.hasNext()) {
//                String wordFromTextFile = sc.next();
////                blockingQueue.put(wordFromTextFile);
//                arrWft.add(wordFromTextFile);
////                count++;
//            }
////            blockingQueue.put("EOF");  //When end of file has been reached
////            String text = "Number of words in " + fileName + ": " + count;
////            System.out.println(text);
//
//            String strArrEft = String.join(" ", arrWft);
//            String strFileText = strArrEft.toLowerCase();
//            String[] strFText = strFileText.split("[(' ')?!:;,.-]");
//            HashMap<String, Integer> fileUniques = new HashMap<String, Integer>();
//            for (String word : strFText) {
//                if (word.length() <= 2) {
//                    continue;
//                }
//                Integer existingCount = fileUniques.get(word);
//                fileUniques.put(word, (existingCount == null ? 1 : (existingCount + 1)));
//            }
//            Set<Map.Entry<String, Integer>> uniqueSet = fileUniques.entrySet();
//            ArrayList<String> reslist = new ArrayList<>();
//            for (Map.Entry<String, Integer> entry : uniqueSet) {
//                if (entry.getValue() >= 1) {
////                    System.out.println(entry.getKey() + " - " + entry.getValue());
//                    reslist.add(entry.getKey() + " - " + entry.getValue());
//                }
//            }
//            String fText = String.join(", ", reslist);
//
//            blockingQueue.put(fText);
//            blockingQueue.put("EOF");  //When end of file has been reached
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                br.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        /////////////////////////////////////////////////////////////////////////////////////////////////
//
//    }
//}
