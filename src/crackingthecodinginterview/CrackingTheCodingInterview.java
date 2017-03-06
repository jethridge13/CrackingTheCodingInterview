package crackingthecodinginterview;

import java.util.HashMap;

/**
 *
 * @author Joshua
 */
public class CrackingTheCodingInterview {

    /**
     * Problem 1.5
     *
     * @param s The string to compress
     * @return The compressed string or original string if not compressible
     */
    public static String compressString(String s) {
        boolean compressable = isCompressible(s);
        if (!compressable) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        char last = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == last) {
                count++;
            } else {
                sb.append(last);
                sb.append(count);
                last = s.charAt(i);
                count = 1;
            }
        }
        sb.append(last);
        sb.append(count);
        return sb.toString();
    }

    /**
     * Problem 1.5
     *
     * @param s The string to test
     * @return A boolean if the string is compressible or not
     */
    public static boolean isCompressible(String s) {
        int moreChars = 0, fewerChars = 0;
        char last = s.charAt(0);
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == last) {
                count++;
            } else {
                if (count > 2) {
                    moreChars++;
                } else if (count > 2) {
                    fewerChars++;
                }
            }
        }
        if (count > 2) {
            moreChars++;
        } else if (count > 2) {
            fewerChars++;
        }
        return fewerChars < moreChars;
    }

    /**
     * Problem 1.1
     *
     * @param s The string to be used in the problem.
     * @return A boolean that indicates if the string only has unique characters
     */
    public static boolean stringUnique(String s) {
        HashMap map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) != null) {
                return false;
            }
            map.put(s.charAt(i), 1);
        }
        return true;
    }

    /**
     * Problem 1.3, assuming ASCII strings only.
     *
     * @param s1
     * @param s2
     * @return A boolean if the strings are permutations of one another.
     */
    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] charCount = new int[256];
        int s1c, s2c;
        for (int i = 0; i < s1.length(); i++) {
            s1c = s1.charAt(i);
            s2c = s2.charAt(i);
            charCount[s1c]++;
            charCount[s2c]--;
        }
        for (int i = 0; i < 256; i++) {
            if (charCount[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Problem 1.4
     *
     * @param s The string to be modified.
     * @param l The length of the string before the padded space
     * @return A string with all spaces replaced with '%20'
     */
    public static String webifySpaces(String s, int l) {
        if (s.indexOf(' ') == -1) {
            return s;
        }
        char[] c = s.toCharArray();
        int spaceCount = 0;
        for (int i = 0; i < l; i++) {
            if (c[i] == ' ') {
                spaceCount++;
            }
        }
        int newLength = l + spaceCount * 2;
        for (int i = l - 1; i > 0; i--) {
            if (c[i] == ' ') {
                c[newLength - 1] = '0';
                c[newLength - 2] = '2';
                c[newLength - 3] = '%';
                newLength -= 3;
            } else {
                c[newLength - 1] = c[i];
                newLength--;
            }
        }
        String result = new String(c);
        return result;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }

}
