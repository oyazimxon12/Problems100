
public class Pr140 {
    boolean natural(double x) {
        return x > 0 && Math.floor(x) == x;   // musbat va kasr qismi yo'q
    }

    void yechim() {
        double x = 5.0;
        if (natural(x)) {
            System.out.println("Natural son");
        } else {
            System.out.println("Natural son emas");
        }
    }

    public static void main(String[] args) {
        Pr140 obj = new Pr140();
        obj.yechim();
    }
}
