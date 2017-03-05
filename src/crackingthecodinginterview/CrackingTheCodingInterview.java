package crackingthecodinginterview;

import java.util.HashMap;

/**
 *
 * @author Joshua
 */
public class CrackingTheCodingInterview {
    
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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}
