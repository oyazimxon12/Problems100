
public class Pr173 {
    void yechim() {
        for (int i = 1000; i <= 9999; i++) {
            int a = i / 1000;
            int b = i / 100 % 10;
            int c = i / 10 % 10;
            int d = i % 10;
            if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0 && d % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pr173 obj = new Pr173();
        obj.yechim();
    }
}
