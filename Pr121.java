public class Pr121 {
    static void Pattern8(){
        int n = 5;
        for (int i = n; i >=1 ; i--) {
            for (int j = n; j >= 1; j--) {
                if (j > i){
                    System.out.print("   ");
                }else {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }
}
