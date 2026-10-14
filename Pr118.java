public class Pr118 {
    static void Pattern5(){
        int n = 5;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                if (i == n / 2){

                } else if (j == n / 2) {
                    System.out.print(" ");
                }else {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }
}
