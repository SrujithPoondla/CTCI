package Chapter1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by srujithpoondla on 4/5/17.
 */
public class PalindromePermutation {
    public static void main(String[] args) {
        String str = "tacte coa";
        System.out.println(isPalindromePerm(str));

    }

    private static boolean isPalindromePerm(String str) {
        Map<Character,Integer> map = new HashMap<>();
        char[] c = str.toCharArray();
        Arrays.sort(c);
        int count=0;
        for (int i=0;i<c.length;i++) {
            if (Character.isLetter(c[i])) {
                if (map.containsKey(c[i])) {
                    map.put(c[i], map.get(c[i]) + 1);
                } else {
                    map.put(c[i], 1);
                }
            }
        }
        for (Map.Entry<Character,Integer> entry :map.entrySet()
             ) {
            if(entry.getValue()%2==1){
                count=count+1;
            }
            if(count>1){
                return false;
            }
        }
        return true;
    }
}
