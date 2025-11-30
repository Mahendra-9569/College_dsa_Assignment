package dynamicProgramming9;

public class maxProfitToBurstBaloons {
    public static int maxAns(int burst[], int i, int j){
        if(i > j)return 0;

        int max = Integer.MIN_VALUE;
        for(int k = i; k<=j; k++){
            int left = maxAns(burst, i, k-1);
            int right = maxAns(burst, k+1, j);
            int currAns = burst[j+1]*burst[k]*burst[i-1];
            int ans = left + right + currAns;
            max = Math.max(max, currAns);
        }

        return max;

    }
    public static void main(String[] args) {
        int burst[] = {1, 3, 1, 4, 7, 5, 1};
        System.out.println(maxAns(burst, 1, burst.length-2));
    }
}
