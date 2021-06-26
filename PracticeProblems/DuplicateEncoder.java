
/**
 * Write a description of DuplicateEncoder here.
 * 
 * The goal of this exercise is to convert a string to a new string where each character in the new string is 
 * "(" if that character appears only once in the original string, or ")" if that character appears more than 
 * once in the original string. Ignore capitalization when determining if a character is a duplicate.
 * 
 * @author (Elliot Connell) 
 * @version (25/06/21)
 */

import java.util.*;

public class DuplicateEncoder {
    
    public String encode(String word) {
        // create the encoded string to return
        String result = "";
        // create the empty HashMap to store number of occurances each character occurs
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        // populate the HashMap
        // loop throught the word string
        for (int index = 0; index < word.length(); index++){
            char indexChar = word.charAt(index);           
            if (Character.isLetter(indexChar)){
                indexChar = Character.toLowerCase(indexChar);
            }
            // if hashmap doesnt contains char
            if (!map.containsKey(indexChar)){
                map.put(indexChar, 1); 
                //add char to map with value of one
            }
            // else
            else{
                // increase value of char by one
                map.put(indexChar, map.get(indexChar)+ 1);
            }
        }
        System.out.println(map);
               
        //encode the message
        // loop through the string
            
            // if value of char is more than one
            
               // add '(' to result string
               
            // else
            
               // add ')' to result string
        
        // return the encoded string
        return result;        
    }
    
    public void tester(){
        String result = encode("din");
        System.out.println("expected result = '((('");
        System.out.println("returns = " + result);
        
        result = encode("recede");
        System.out.println("expected result = '()()()'");
        System.out.println("returns = " + result);
        
        result = encode("Success");
        System.out.println("expected result = ')())())'");
        System.out.println("returns = " + result);
        
        result = encode("(( @");
        System.out.println("expected result = '))(('");
        System.out.println("returns = " + result);
        
        
    }

}
