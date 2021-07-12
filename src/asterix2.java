public class asterix2 {
    public static void main(String[] args) {
        for(int n = 0; n<5; n++) {
            for(int i = n; i>=0;i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


//
//    public static int c;
//
//    public static void main(String[] args) {
//        Scanner inp = new Scanner(System.in);
//
//        System.out.print("Enter number of disks: ");
//        int disks = inp.nextInt();
//
//        System.out.print("Enter destination post: ");
//        String endGoal = inp.next();
//
//        System.out.println("Moves:");
//        char next = 'C';
//
//        if (endGoal.charAt(0) == 'C') {
//            next = 'B';
//        }
//        moveDisk(disks, 'A', endGoal.charAt(0), next);
//
//        System.out.println("Number of moves: " + c);
//    }
//
//    public static void moveDisk(int n, char start, char end, char middle) {
//        if (n == 1) {
//            System.out.println(start + " -> " + end);
//            c++;
//            return;
//        }
//        moveDisk(n-1, start, middle, end);
//        System.out.println(start + " -> " + end);
//        moveDisk(n-1, middle, end, start);
//        c++;
//    }
