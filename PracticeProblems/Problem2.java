
/**
 * Write a description of Problem2 here.
 * 
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by 
 * ones at both ends in the binary representation of N.

 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 
 * as binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The 
 * number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary 
 * representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

 * Write a function:

 * class Solution { public int solution(int N); }

 * that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N
 * doesn't contain a binary gap.

 * For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so 
 * its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation
 * '100000' and thus no binary gaps.

 * Write an efficient algorithm for the following assumptions:

 * N is an integer within the range [1..2,147,483,647].
 * 
 * @author (Elliot Connell) 
 * @version (6/6/21)
 */
public class Problem2 {
    
    private int solution(int num){
        String binaryString = Integer.toBinaryString(num);
        int longestString = 0;
        boolean containsValidString =false;
        //check if string contains valid string
        int start = binaryString.indexOf('1');
        int end = binaryString.indexOf('1', start + 1);
        String substring =  binaryString.substring(start+1, end);
        int length = substring.length();
        
        if (end == -1)
        
        return length;
    }


        
        //for (int i = 1; i< binary.length(); i++){

            //if (binary.charAt(i) == '0') {
            //&& (flag == true)){
               //count += 1;
               // if (count > longest){
                 //   longest = count;
               // }
           // }
           // if (binary.charAt(i) == '1'){
            //    count = 0;
                //if (flag = true){
                //    i = i -1;
                //    flag = false;
                //}

           // }
    


    
    public void tester(){
        int result = solution(1041);
        System.out.println("test1, expected 5, returns " + result);
        
        
        result = solution(15);
        System.out.println("test2, expected 0, returns " + result);
        
        result = solution(32);
        System.out.println("test3, expected 0, returns " + result);
        
    }

}
