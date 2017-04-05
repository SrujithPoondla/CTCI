package Chapter1;

/**
 * Created by srujithpoondla on 4/5/17.
 */
public class StringRotation {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println(isSubString(s1,s2));

    }

    private static boolean isSubString(String s1, String s2) {
        String checkString = s1+s1;
        if(checkString.contains(s2)){
            return true;
        }else{
            return false;
        }
    }
}
