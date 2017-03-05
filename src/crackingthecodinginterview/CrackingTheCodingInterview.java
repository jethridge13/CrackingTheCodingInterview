package crackingthecodinginterview;

import java.util.HashMap;

/**
 *
 * @author Joshua
 */
public class CrackingTheCodingInterview {
    
    /**
     * Problem 1.1
     * @param s The string to be used in the problem.
     * @return A boolean that indicates if the string only has unique characters
     */
    public static boolean stringUnique(String s) {
        HashMap map = new HashMap();
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) != null){
                return false;
            }
            map.put(s.charAt(i), 1);
        }
        return true;
    }
    
    /**
     * Problem 1.3, assuming ASCII strings only.
     * @param s1
     * @param s2
     * @return A boolean if the strings are permutations of one another.
     */
    public static boolean isPermutation(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int[] charCount = new int[256];
        int s1c, s2c;
        for(int i = 0; i < s1.length(); i++){
            s1c = s1.charAt(i);
            s2c = s2.charAt(i);
            charCount[s1c]++;
            charCount[s2c]--;
        }
        for(int i = 0; i < 256; i++){
            if(charCount[i] != 0){
                return false;
            }
        }
        return true;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}
