
/**
 * Write a description of SumOfDigits here.
 * 
 * Get a number N and find the lowest value where the sum of all the digits equals N
 * Focus on correctness not speed
 * 
 * For example: N = 15
 * possible combinations = 79, 88, 97, 1159
 * returns 79
 * 
 * N = 7
 * possible combinations = 7
 * returns 7
 * 
 * N = 19
 * possible combinations = 199, 289, 298, 379, 397
 * 
 * 
 * @author (Elliot Connell) 
 * @version (15/06/21)
 */

import java.util.*;

public class SumOfDigits {

    private int sumOfDigits(int value){
        int result = 0;
        
        // starting a 1, loop until result is found
        for(int number = 1; number <= 1000000; number++){
            ArrayList<Integer> digits = digitsList(number);
            
            
            int sum = 0; 
            for (int i = 0; i<digits.size(); i++){
                sum += digits.get(i);                
            }

            // if sum of digits equals value result equals number
            if (sum == value) {
                result = number;
                break;
            }
            
        }
        
        
        return result;
    }
    
    private ArrayList<Integer> digitsList(int number) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        
        String numString = Integer.toString(number);

        for (int index = 0; index < numString.length(); index++){
            char intChar = numString.charAt(index);
            int charInteger = Character.getNumericValue(intChar);
            
            digits.add(charInteger);               
        }
        
        return digits;
    }
    
    public void tester(){
        
        int result = sumOfDigits(16);
        System.out.println("expected result = 79. returns = " + result);
        
        result = sumOfDigits(7);
        System.out.println("expected result = 7. returns = " + result);
        
        result = sumOfDigits(19);
        System.out.println("expected result = 199. returns = " + result);
        
    }
}
