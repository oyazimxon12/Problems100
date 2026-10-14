public class Pr103 {
    static int n = 5;
  static void Letter() {
        char letter = (char) ('A' + n - 1);
        for (int i = n; i >=1 ; i--) {
            for (int j =1; j <= i; j++) {
                System.out.print(letter+" ");
            }
            System.out.println();
            letter--;
        }
    }
}
