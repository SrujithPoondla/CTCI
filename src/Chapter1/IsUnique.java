package Chapter1;

/**
 * Created by srujithpoondla on 4/4/17.
 */
public class IsUnique {
    public static void main(String[] args) {
        String str = "srujith";
        System.out.println(isUnique(str));

    }

    private static boolean isUnique(String str) {
        boolean[] charSet = new boolean[128];
        if(str.length()>128){
            return false;
        }
        int c=0;
        for (int i=0;i<str.length();i++){
            c=str.charAt(i);
            if(charSet[c]){
                return false;
            }else {
                charSet[c]=true;
            }
        }
        return true;
    }
}
