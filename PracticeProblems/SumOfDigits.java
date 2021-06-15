
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

public class SumOfDigits {
    
    private int sumOfDigits(int value){
        int result = 0;
        
        return result;
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
