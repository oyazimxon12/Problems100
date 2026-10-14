
public class Pr170 {
    void yechim() {
        for (int i = 1000; i <= 9999; i++) {
            int a = i / 1000;
            int b = i / 100 % 10;
            int c = i / 10 % 10;
            int d = i % 10;
            if (a % 2 == 1 && b % 2 == 1 && c % 2 == 1 && d % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pr170 obj = new Pr170();
        obj.yechim();
    }
}
