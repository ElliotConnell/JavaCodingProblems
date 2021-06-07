
/**
 * Write a description of Problem3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Problem3 {
    
    public int[] solution(int[] numArray, int rotations) {
        int[] newArray = new int[numArray.length];
        
        //int value = offset - 1;
        int length = numArray.length;

        for (int i = 0; i <= length-1; i++){
            int maxIndex = length - 1;
            if ((i + rotations) <= maxIndex){
                newArray[i] = numArray[i+rotations-1];
            }
            else{
               newArray[i] = numArray[i + rotations - length];
            }
        }
        return newArray;
    }
    
    public void tester() {
        int[] test1 = {3, 8, 9, 7, 6};
        int[] result = solution(test1, 3);
        System.out.println(result);
        
        int[] test2 = {0, 0, 0};
        result = solution(test2, 1);
        System.out.println(result);
        
        int[] test3 = {1, 2, 3, 4};
        result = solution(test3, 4);
        System.out.println(result);
    }
    
    

}
