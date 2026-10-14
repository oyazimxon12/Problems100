
public class Pr184 {
    void yechim() {
        int n = 12;
        long kopaytma = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) kopaytma *= i;
        }
        System.out.println(kopaytma);
    }

    public static void main(String[] args) {
        Pr184 obj = new Pr184();
        obj.yechim();
    }
}
