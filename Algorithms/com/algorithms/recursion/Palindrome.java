package com.algorithms.recursion;

public class Palindrome {

    private static boolean isPalindrome(String str) {
        //	System.out.println(str);
        if (str.length()==1)
            return true;
        if(str.charAt(0) != str.charAt(str.length()-1))
            return false;
        if (str.length()==2 )
            return true;

        return isPalindrome(str.substring(1, str.length()-1));
    }

    public static void main(String[] args) {
        System.out.println("Check \"palindrom\" "+ isPalindrome("palindrome"));
        System.out.println("Check \"malayalam\" " + isPalindrome("malayalam"));
    }
}
