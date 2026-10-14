
public class Pr125 {
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
        System.out.println("EKUK = " + ekuk(a, b));
    }

    public static void main(String[] args) {
        Pr125 obj = new Pr125();
        obj.yechim();
    }
}
