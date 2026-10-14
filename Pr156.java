
public class Pr156 {
    boolean mukammal(int n) {
        int summa = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) summa += i;
        }
        return n > 0 && summa == n;
    }

    void yechim() {
        int n = 28;
        if (mukammal(n)) {
            System.out.println("Mukammal son");
        } else {
            System.out.println("Mukammal son emas");
        }
    }

    public static void main(String[] args) {
        Pr156 obj = new Pr156();
        obj.yechim();
    }
}
