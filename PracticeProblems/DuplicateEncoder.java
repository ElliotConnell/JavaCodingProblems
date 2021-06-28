
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
    
    private HashMap<Character, Integer> createHashMap(String word){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for (int index = 0; index < word.length(); index++){
            char indexChar = word.charAt(index);           
            if (Character.isLetter(indexChar)){
                indexChar = Character.toLowerCase(indexChar);
            }
            if (!map.containsKey(indexChar)){
                map.put(indexChar, 1); 
            }
            else{
                map.put(indexChar, map.get(indexChar)+ 1);
            }
        }
        return map;
    }
    
    public String encode(String word) {
        StringBuilder result = new StringBuilder();
        HashMap<Character, Integer> map = createHashMap(word);
        
        for (int index = 0; index < word.length(); index++) {
            char indexChar = word.charAt(index);
            if (Character.isLetter(indexChar)){
                indexChar = Character.toLowerCase(indexChar);
            }
            if (map.get(indexChar) > 1){
                result.append( ")");
            }           
            else {            
               result.append("(");
            }
        }
        return result.toString();        
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
