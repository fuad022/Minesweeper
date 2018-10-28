package Algorithms;

public class Palindrome {
    public static void main(String[] args) {
        String s = "2552";
        Palindrome palindrome = new Palindrome();
        palindrome.isPalindrome(s);
    }

    private boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                System.out.println("Not palindrome");
                return false;
            }
        }
        System.out.println("Palindrome");
        return true;
    }

    //////////////////////////////////////////////////////////////////
//    int i = 1221;
//    String a = Integer.toString(i);
//    StringBuffer sb = new StringBuffer(a).reverse();
//    String strRev = sb.toString();
//        System.out.println(strRev);
//        if (strRev.equalsIgnoreCase(a)) {
//        System.out.println("Palindrome");
//    } else {
//        System.out.println("Not palindrome");
//    }
    //////////////////////////////////////////////////////////////////
}
