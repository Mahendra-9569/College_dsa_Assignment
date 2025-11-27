package Stack1;
import java.util.*;
public class smallerOnLeft {
    public static void main(String args[]){
        int arr[] = {4,5,2,10,8};
        int n = arr.length;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }
}
