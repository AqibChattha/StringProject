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
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                if ((s.charAt(i + 1) >= 33 && s.charAt(i + 1) <= 47) || (s.charAt(i + 1) >= 58 && s.charAt(i + 1) <= 64) || (s.charAt(i + 1) >= 91 && s.charAt(i + 1) <= 96) || (s.charAt(i + 1) >= 123 && s.charAt(i + 1) <= 126)) {
                    boolean flag = false;
                    int check = i + 1;
                    for (int j = check; s.charAt(j) != ' ' && j < s.length() - 1; j++) {
                        if (s.charAt(j) != ' ' || s.charAt(j + 1) >= 33 && s.charAt(j + 1) <= 47 || s.charAt(j + 1) >= 58 && s.charAt(j + 1) <= 64 || s.charAt(j + 1) >= 91 && s.charAt(j + 1) <= 96 || s.charAt(j + 1) >= 123 && s.charAt(j + 1) <= 126) {
                        } else {
                            flag = true;
                        }
                    }
                    if (flag == true) {
                        count++;
                        System.err.print("2 ");
                    }
                } else {
                    count++;
                    System.err.print("1 ");
                }
            }
        }
        return count + 1;
    }

    static int vowelCounter(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) == 'U') {
                count++;
            }
        }
        return count;
    }

    static String displayVertical(String s) {
        String modifiedString = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                modifiedString += s.charAt(i) + "\n";
            }
        }
        return modifiedString;
    }

    static String ridMultipleBlank(String s) {
        String modifiedString = "";
        for (int i = 0; i < s.length(); i++) {

            if (i != s.length() || i != 0) {
                if (s.charAt(i) != ' ' || (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ' && s.charAt(i + 1) != ',' && s.charAt(i + 1) != '.' && s.charAt(i + 1) != '?' && s.charAt(i + 1) != '!' && s.charAt(i + 1) != ')' && s.charAt(i + 1) != '}' && s.charAt(i + 1) != ']' && s.charAt(i - 1) != '(' && s.charAt(i - 1) != '{' && s.charAt(i + 1) != '[' && s.charAt(i + 1) != ':')) {
                    modifiedString += s.charAt(i);
                }
            } else {
                if (s.charAt(i) != ' ') {
                    modifiedString += s.charAt(i);
                }
            }
        }
        return modifiedString;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("InputString:");
        Scanner scanner = new Scanner(System.in);
        String input_String = scanner.nextLine();
//        System.out.println("Number of words: " + wordCounter(input_String));
//        System.out.println("Number of vowels: " + vowelCounter(input_String));
//        System.out.print("Your sentence printed vertically is: \n" + displayVertical(input_String));
        System.out.println(ridMultipleBlank("\n" + input_String));
    }

}
