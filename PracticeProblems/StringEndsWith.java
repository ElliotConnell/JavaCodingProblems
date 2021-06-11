
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
        // generate int variable length of str
        int strLength = str.length();
        int stringLength = string.length();
        // generate String variable of the last N characters of string
        // N being the length of str
        String endSubstring = string.substring(stringLength-strLength);
        // if new string equals str
        if (endSubstring.equals(str)){  
            return true;
        }
        else{
            return false;
        }
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
