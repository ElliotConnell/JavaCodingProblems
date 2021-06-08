
/**
 * Write a description of Problem6 here.
 * 
 * Write a function

 * class Solution { public int solution(int[] A); }

 * that, given an array A consisting of N integers, returns the number of distinct values in array A.

 * For example, given array A consisting of six elements such that:

 * A[0] = 2    A[1] = 1    A[2] = 1
 * A[3] = 2    A[4] = 3    A[5] = 1
 * the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

 * Write an efficient algorithm for the following assumptions:

 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 * 
 * @author (Elliot Connell) 
 * @version (08/06/21)
 */

import java.util.*;

public class Problem6 {
    
    public int solution(int[] numbers) {
        int length = numbers.length - 1;
        List<Integer> numbersList = new ArrayList<Integer>();
        for (int index = 0; index < length; index++){
            int value = numbers[index];
            if (!numbersList.contains(value)) {
                numbersList.add(value);
            }
        }
        return numbersList.size();

    }
    
    public void tester() {
        int[] test0 = {1, 2, 1};
        int result = solution(test0);
        System.out.println("test0, expected 2, returns " + result);;
        
        int[] test1 = {9, 3, 9, 3, 9, 7, 9};
        result = solution(test1);
        System.out.println("test1, expected 3, returns " + result);
        
        int[] test2= {2, 1, 1, 2, 3, 1};
        result = solution(test2);
        System.out.println("test2, expected 3, returns " + result);
        
    }

}
