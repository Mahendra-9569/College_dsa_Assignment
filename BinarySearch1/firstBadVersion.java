package BinaryTree1;

public class firstBadVersion {
    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid; 
            } else {
                left = mid + 1; 
            }
        }
        return left; 
    }

    public static boolean isBadVersion(int version) {
        return version >= 4;
    }

    public static void main(String[] args) {
        /*
        You are a product manager and currently leading a team to develop a new product. 
        Unfortunately, the latest version of your product fails the quality check. 
        Since each version is developed based on the previous version, all the versions after a bad version are also bad.
        Given n versions [1, 2, ..., n] and an API bool isBadVersion(version) which returns whether version is bad,
        implement a function to find the first bad version. You should minimize the number of calls to the API.
         */
        
        int n = 5; 
        int result = firstBadVersion(n);
        System.out.println("First Bad Version: " + result);
    }
}
