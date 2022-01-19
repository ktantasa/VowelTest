//test out whether a word have a vowel

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VowelsTest {
   public static void main(String args[]) {
      char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
      ArrayList<Character> vowelsList = new ArrayList<>();
      HashMap<Character, Integer> vowelsCount = new HashMap<Character, Integer>();
      for (char vowel : vowels) {
         vowelsList.add(vowel);
      }

      System.out.println("Please enter a word ");
      Scanner in = new Scanner(System.in); // take in a word
      String word = in.next();
      in.close();

      for (int i = 0; i <= word.length() - 1; i++) {
         char currentChar = (word.charAt(i));
         if (vowelsList.contains(currentChar)) {// if if the character is a vowel
            if (vowelsCount.containsKey(currentChar)) { // word in there already exists
               int currentCount = vowelsCount.get(currentChar);
               vowelsCount.replace(currentChar, currentCount + 1);
            } else {
               vowelsCount.put(currentChar, 1);
            }
         }
      }
      System.out.println();

      if (vowelsCount.isEmpty()) { // list is empty
         System.out.println("The word does not contains any vowel");
         return;
      } else {
         System.out.println("The word contains the following vowels ");
         for (Map.Entry<Character, Integer> entry : vowelsCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
         }
         System.out.println();
      }
   }
}
