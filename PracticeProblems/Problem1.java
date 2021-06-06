
/**
 * Write a description of Problem1 here.
 * Write a function:

 * class Solution { public int solution(int[] A); }

 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

 * Given A = [1, 2, 3], the function should return 4.

 * Given A = [−1, −3], the function should return 1.

 * Write an efficient algorithm for the following assumptions:

 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 * 
 * @author (Elliot Connell) 
 * @version (6/6/21)
 */
import java.util.*;

public class Problem1 {
    
    private int solution(int[] A) {
        //set the variables
        int N = A.length;
        int lowest = 1;
                
        
        for (int i = 0; i < N; i++) {
            if (A[i] == lowest) {
                lowest += 1;
                i = 0;
            }
                        
        }
               
               
        return lowest;
    }
    
    public void tester(){
        int[] test1 = {1,3,6,4,1,2};
        int result = solution(test1);
        System.out.println("test1, expected 5, returns " + result);
        
        int[] test2 = {1, 2, 3};
        result = solution(test2);
        System.out.println("test2, expected 4, returns " + result);
        
        int[] test3 = {-1,-3};
        result = solution(test3);
        System.out.println("test3, expected 1, returns " + result);
        
    }

}
