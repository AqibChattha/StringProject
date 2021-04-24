/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringrepositry;

import java.util.Scanner;

/**
 *
 * @author humza
 */
public class StringRepositry {

    static int wordCounter(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                if (s.charAt(i + 1) >= 33 && s.charAt(i + 1) <= 47 || s.charAt(i + 1) >= 58 && s.charAt(i + 1) <= 64 || s.charAt(i + 1) >= 91 && s.charAt(i + 1) <= 96 || s.charAt(i + 1) >= 123 && s.charAt(i + 1) <= 126) {
                    boolean flag = false;
                    int check = i + 1;
                    for (int j = check; s.charAt(j) != ' ' && j < s.length(); j++) {
                        if (s.charAt(j + 1) >= 33 && s.charAt(j + 1) <= 47 || s.charAt(j + 1) >= 58 && s.charAt(j + 1) <= 64 || s.charAt(j + 1) >= 91 && s.charAt(j + 1) <= 96 || s.charAt(j + 1) >= 123 && s.charAt(j + 1) <= 126) {
                        } else {
                            flag = true;
                        }
                    }
                    if (flag == true) {
                        count++;
                    }
                } else {
                    count++;
                }
            }
        }
        return count + 1;
    }
    
        static int vowelCounter(String s){
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U') {
                    count++;
                }
            }
            return count;
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the string:");
        Scanner scanner = new Scanner(System.in);
        String input_String = scanner.nextLine();
        System.out.println("Number of words: "+wordCounter(input_String));
        System.out.println("Number of vowels: "+vowelCounter(input_String));
    }

}
