public class Pr105 {
    static int n = 5;
    static void Pattern105(){
        for (int i = n; i >= 1 ; i--) {
            for (int j = i; j <=n ; j++) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }
}
