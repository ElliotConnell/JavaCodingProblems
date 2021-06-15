
/**
 * Write a description of StringEndsWith here.
 * 
 * Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).

 * Examples:

 * strEndsWith('abc', 'bc') -- returns true
 * strEndsWith('abc', 'd') -- returns false
 * 
 * @author (Elliot Connell) 
 * @version (a version number or a date)
 */
public class StringEndsWith {
    
    private boolean strEndsWith(String string, String str) {
        boolean result = false;
        int strLength = str.length();
        int stringLength = string.length();
        if (strLength <= stringLength){
            String endSubstring = string.substring(stringLength-strLength);
            if (endSubstring.equals(str)){
                result = true;
            }
        }
        return result;
        
        // alternate solution found using string function endsWith()
        // return string.endsWith(str);
    }
    
    public void tester(){
        
        boolean result = strEndsWith("abc", "bc");
        System.out.println("expected result = true. returns = " + result);
        
        result = strEndsWith("abc", "d");
        System.out.println("expected result = false. returns = " + result);
        
        result = strEndsWith("longer test statement", "ment");
        System.out.println("expected result = true. returns = " + result);
        
        result = strEndsWith("", "abc");
        System.out.println("expected result = false. returns = " + result);
        
        result = strEndsWith("abc", "abcd");
        System.out.println("expected result = false. returns = " + result);
                
    }

}
