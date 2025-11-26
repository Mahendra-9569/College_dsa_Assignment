package RecursionII;

public class TowerofHanoi {
    public static void towerOfHanoi(int n, String source, String helper, String destination) {
        
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        towerOfHanoi(n - 1, source, destination, helper);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n - 1, helper, source, destination);
    }

    public static void main(String args[]) {
        /*
        You are given n disks placed on a starting rod (from), with the smallest disk on top and the largest at the bottom. There are three rods: the starting rod(from), the target rod (to), and an auxiliary rod (aux).
        You have to calculate the minimum number of moves required to transfer all n disks from the starting rod to the target rod, following these rules:
        1. Only one disk can be moved at a time.
        2. A disk can only be placed on top of a larger disk or on an empty rod.
        Return the minimum number of moves needed to complete the task. 
       */
        int n = 3; 
        towerOfHanoi(n, "Source", "Helper", "Destination");
    }
}
