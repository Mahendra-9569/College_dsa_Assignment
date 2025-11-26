package StringII;
import java.util.*;
public class removeDuplicates {
    public static void main(String args[]){
        String str = "aaabbbccdde";
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(i>0 && str.charAt(i) == str.charAt(i-1)){
                continue;
            } else {
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }
}
