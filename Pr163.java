
public class Pr163 {
    long daraja(int s, int n) {
        long natija = 1;
        for (int i = 1; i <= n; i++) {
            natija *= s;
        }
        return natija;
    }

    void yechim() {
        int s = 2;
        int n = 10;
        System.out.println(daraja(s, n));
    }

    public static void main(String[] args) {
        Pr163 obj = new Pr163();
        obj.yechim();
    }
}
