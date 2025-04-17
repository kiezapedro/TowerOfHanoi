public class TOH {

    public static void main(String[] args) {
        int numDisks = 6;
        towerOfHanoi(numDisks, "Tower 1", "Tower 2", "Tower 3");
    }

    public static void towerOfHanoi(int n, String source, String destination, String auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move top n-1 disks from source to auxiliary
        towerOfHanoi(n - 1, source, auxiliary, destination);

        // Move nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move n-1 disks from auxiliary to destination
        towerOfHanoi(n - 1, auxiliary, destination, source);
    }
}
