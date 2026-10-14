
public class Pr130 {
    boolean tub(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    void yechim() {
        int n = 30;
        for (int i = 2; i <= n; i++) {
            if (tub(i)) System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pr130 obj = new Pr130();
        obj.yechim();
    }
}
