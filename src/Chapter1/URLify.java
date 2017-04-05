package Chapter1;

/**
 * Created by srujithpoondla on 4/5/17.
 */
public class URLify {
    public static void main(String[] args) {
        String input = "Mr Srujith is       ";
        int length = 13;
        System.out.println(urlify(input,length));
    }

    private static String urlify(String input, int length) {
        char[] inputArray= input.toCharArray();
        for (int i=input.length()-1;i>0;i--){
            if(input.charAt(length)!=' '){
                inputArray[i]=inputArray[length];
                length=length-1;
            }else{
                inputArray[i]='0';
                inputArray[i-1]='2';
                inputArray[i-2]='%';
                i=i-2;
                length=length-1;
            }
        }
        return new String(inputArray);
    }
}
