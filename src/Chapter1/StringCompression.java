package Chapter1;

import java.util.Arrays;

/**
 * Created by srujithpoondla on 4/5/17.
 */
public class StringCompression {
    public static void main(String[] args) {
//        String str = "aabbccdeefghjk";
        String str = "aaaabbbb";
        System.out.println(compressString(str));
    }

    private static String compressString(String str) {
        char[] c = str.toCharArray();
        Arrays.sort(c);
        StringBuilder sb = new StringBuilder();
        char current=' ';
        char prev=c[0];
        int count=1;
        for(int i=1;i<c.length;i++){
            current=c[i];
            if(current==prev){
                count = count+1;
            }else{
                sb.append(prev);
                sb.append(count);
                count=1;
            }
            prev = current;
        }
        sb.append(current);
        sb.append(count);
        if(sb.toString().length()>str.length()){
            return str;
        }
        return sb.toString();
    }
}
