public class Pr113 {
    static void Pattern(){
        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= 5) {
                if (i % 2 == 1 || j % 2 == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
