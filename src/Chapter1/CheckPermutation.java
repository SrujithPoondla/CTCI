package Chapter1;

import java.util.Arrays;

/**
 * Created by srujithpoondla on 4/5/17.
 */
public class CheckPermutation {
    public static void main(String[] args) {
        String s1= "srujith";
        String s2 = "rujsith";
        System.out.println(checkPerm(s1,s2));
    }

    private static boolean checkPerm(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(new String(c1).equals(new String(c2))){
            return true;
        }
        return false;
    }
}
