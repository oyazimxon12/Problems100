public class Pr109 {
        static void murakkab() {
            int n = 9;
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count > 2) {
                System.out.println("Murakkab son ");
            } else {
                System.out.println("Murakkab son emas");
            }
        }
    }

