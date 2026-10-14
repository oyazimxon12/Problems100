
public class Pr126 {
    int ekub(int a, int b) {
        while (b != 0) {
            int qoldiq = a % b;
            a = b;
            b = qoldiq;
        }
        return a;
    }

    int ekuk(int a, int b) {
        return a / ekub(a, b) * b;
    }

    void yechim() {
        int a = 4;
        int b = 6;
        System.out.println("EKUB = " + ekub(a, b));
        System.out.println("EKUK = " + ekuk(a, b));
    }

    public static void main(String[] args) {
        Pr126 obj = new Pr126();
        obj.yechim();
    }
}
