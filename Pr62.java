public class Pr62 {
    static int n = 5;
    static void Pattern(){
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i  ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for (int i = 1; i <=n ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
  }
}
