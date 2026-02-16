import java.util.*;

public class StuPlacement {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("CSE Count:");
        int cse = in.nextInt();

        System.out.println("ECE Count:");
        int ece = in.nextInt();

        System.out.println("Mechanical Count:");
        int mec = in.nextInt();

        if (cse > ece && cse > mec) {
            System.out.println("CSE Department has highest placements");
        } else if (ece > cse && ece > mec) {
            System.out.println("ECE Department has highest placements");
        } else {
            System.out.println("Mechanical Department has highest placements");
        }
    }
}
