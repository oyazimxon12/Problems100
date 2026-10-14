public class Pr108 {
    static void tub() {
        int n = 7;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("tub son");
        } else {
            System.out.println("tub son emas");
        }
    }
}