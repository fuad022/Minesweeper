package Algorithms;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class Algorithms {

    public static void main(String[] args) throws IOException {

//        for (int i = 0; i<=100; i++) {
//            System.out.println(i);
//        }
//        main(args);

//        Date currentDate = new Date();
//
//        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        System.out.println(formatDate.format(currentDate));

//        String myString = "1234";
//        int foo = Integer.parseInt(myString);
//        System.out.println(foo);

        Scanner s = new Scanner (new File("D:\\test.txt")).useDelimiter("\\s+");
        while (s.hasNext()) {
            if (s.hasNextInt()) { // check if next token is an int
                System.out.print(s.nextInt() + "\n"); // display the found integer
            } else {
                s.next(); // else read the next token
            }
        }

//        File file = new File("D:\\test.txt");
//        Scanner scanner = new Scanner(file);
//        scanner.useDelimiter(Pattern.compile("\\W+"));
//        while (scanner.hasNext()) {
//            System.out.println(scanner.next());
//        }

//        BufferedReader br = new BufferedReader(new FileReader("D:\\test.txt"));
//        Map<Integer, String> items = new TreeMap<Integer, String>();
//
//        String line;
//        while (null != (line = br.readLine())) {
//            String[] line_parts = line.split(" ");
//            if (line_parts.length > 1) {
//                StringBuilder desc = new StringBuilder(line_parts[1]);
//                for (int i = 1; i < line_parts.length; i++)
//                {
//                    desc.append(line_parts[i]);
//                }
//                items.put(new Integer(line_parts[0]), desc.toString());
//            }
//        }
//
//        for (Integer key: items.keySet())
//        {
//            System.out.println(key + items.get(key));
//        }

    }

//    private void pageHeader (PrintStream out) {
//
//        out.println ("<html>" +
//                    "<head>" +
//                    "<title>Counter</title>" +
//                    "</head>"+
//                    "<style>a:link {font-family:arial;font-size:9pt;text-decoration:none; color:#000080;}"+
//                    "a:visited {font-family:arial;font-size:9pt;text-decoration:none;color:#000080;}"+
//                    "TD {font-family:arial;font-size:10pt;color:#333300;}"+
//                    "H2 {text-align:center;color:blue;}</style><body bgcolor=\"e6e8fa\">");
//    }

}
