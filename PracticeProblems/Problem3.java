
/**
 * Write a description of Problem3 here.
 * 
 * An array A consisting of N integers is given. Rotation of the array means that each element is shifted
 * right by one index, and the last element of the array is moved to the first place. For example, the 
 * rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 
 * 6 is moved to the first place).
 * 
 * The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
 * 
 * Write a function:
 * 
 * class Solution { public int[] solution(int[] A, int K); }

    that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.
    
    For example, given
    
        A = [3, 8, 9, 7, 6]
        K = 3
    the function should return [9, 7, 6, 3, 8]. Three rotations were made:
    
        [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
        [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
        [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
    For another example, given
    
        A = [0, 0, 0]
        K = 1
    the function should return [0, 0, 0]
    
    Given
    
        A = [1, 2, 3, 4]
        K = 4
    the function should return [1, 2, 3, 4]
    
    Assume that:
    
    N and K are integers within the range [0..100];
    each element of array A is an integer within the range [−1,000..1,000].
    In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 * 
 * @author (Elliot Connell) 
 * @version (07/06/21)
 */
import java.util.Arrays;

public class Problem3 {
    
    public int[] solution(int[] numbers, int offset) {
        int length = numbers.length;
        int[] result = new int[length];
        int maxIndex = length - 1;

        for (int i = 0; i <= maxIndex; i++){
            int resultIndex = i + offset;
            if (resultIndex <= maxIndex){
                result[resultIndex] = numbers[i];
            }
            else{
               result[resultIndex - length] = numbers[i];
            }
        }
        return result;
    }
    
    public void tester() {
        int[] test0 = {1, 2};
        int[] result = solution(test0, 1);
        System.out.println(Arrays.toString(result));
        
        int[] test1 = {3, 8, 9, 7, 6};
        result = solution(test1, 3);
        System.out.println(Arrays.toString(result));
        
        int[] test2 = {0, 0, 0};
        result = solution(test2, 1);
        System.out.println(Arrays.toString(result));
        
        int[] test3 = {1, 2, 3, 4};
        result = solution(test3, 4);
        System.out.println(Arrays.toString(result));
    }
    
    

}
