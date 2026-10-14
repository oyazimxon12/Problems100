
public class Pr164 {
    void yechim() {
        int n = 17;
        int k = 5;
        int butun = 0;
        while (n >= k) {
            n = n - k;
            butun = butun + 1;
        }
        System.out.println("Butun qism = " + butun);
        System.out.println("Qoldiq = " + n);
    }

    public static void main(String[] args) {
        Pr164 obj = new Pr164();
        obj.yechim();
    }
}
