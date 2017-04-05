package Chapter1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by srujithpoondla on 4/5/17.
 */
public class OneAway {
    public static void main(String[] args) {
        String s1="pale";
        String s2= "palesy";
        System.out.println(isOneEditAway(s1,s2));
    }

    private static boolean isOneEditAway(String s1, String s2) {
        Set<Character> set = new HashSet<>();
        if(s1.length()>s2.length()){
            for (char c :s1.toCharArray()
                    ) {
                set.add(c);
            }
            for (char c: s2.toCharArray()
             ) {
                if(set.contains(c)){
                    set.remove(c);
                }
            }
            if(set.size()>1){
                return false;
            }
        }else{
            for (char c :s2.toCharArray()
                    ) {
                System.out.println(c);
                set.add(c);
            }
            for (char c: s1.toCharArray()
                    ) {
                if(set.contains(c)){
                    set.remove(c);
                }
            }
            if(set.size()>1){
                return false;
            }
        }


        return true;
    }
}
