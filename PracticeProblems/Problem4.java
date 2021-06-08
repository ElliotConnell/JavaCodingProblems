
/**
 * Write a description of Problem4 here.
 * A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.

 * For example, in array A such that:
 * 
 * A[0] = 9  A[1] = 3  A[2] = 9
 * A[3] = 3  A[4] = 9  A[5] = 7
 * A[6] = 9
 * the elements at indexes 0 and 2 have value 9,
 * the elements at indexes 1 and 3 have value 3,
 * the elements at indexes 4 and 6 have value 9,
 * the element at index 5 has value 7 and is unpaired.
 * Write a function:

 * class Solution { public int solution(int[] A); }

 * that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

 * For example, given array A such that:

 * A[0] = 9  A[1] = 3  A[2] = 9
 * A[3] = 3  A[4] = 9  A[5] = 7
 * A[6] = 9
 * the function should return 7, as explained in the example above.
 
   
   * Write an efficient algorithm for the following assumptions:

   * N is an odd integer within the range [1..1,000,000];
   * each element of array A is an integer within the range [1..1,000,000,000];
   * all but one of the values in A occur an even number of times.
 * 
 * @author (Elliot Connell) 
 * @version (08/06/21)
 */
public class Problem4 {
    
    public int counter(int value, int[] numbers){
        int maxIndex = numbers.length - 1;
        int counter = 0;
        for (int index = 0; index <= maxIndex; index ++) {
            if (numbers[index] == value) {
                counter += 1;
            }
        }
        return counter;

    }
    
    public int solution(int[] numbers) {
        // set the variables for value of i
        int value = 0;
        int count = 0;
        
        int maxIndex = numbers.length - 1;
        
        for (int i = 0; i <=maxIndex; i++){
            value = numbers[i];
            count = counter(value, numbers);
            if (count == 1){
                break;
            }

        }

        return value;     
    }
    
    public void tester() {
        int[] test0 = {1, 2, 1};
        int result = solution(test0);
        System.out.println("test0, expected 2, returns " + result);;
        
        int[] test1 = {9, 3, 9, 3, 9, 7, 9};
        result = solution(test1);
        System.out.println("test1, expected 7, returns " + result);
        
    }

}
