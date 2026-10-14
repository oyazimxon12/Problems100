
public class Pr185 {
    boolean palindrom(int n) {
        int asl = n;
        int teskari = 0;
        while (n > 0) {
            teskari = teskari * 10 + n % 10;
            n /= 10;
        }
        return asl == teskari;
    }

    void yechim() {
        int n = 12321;
        if (palindrom(n)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Palindrom emas");
        }
    }

    public static void main(String[] args) {
        Pr185 obj = new Pr185();
        obj.yechim();
    }
}
