
public class Pr127 {
    double yigindi(int n) {
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s += 1.0 / i;
        }
        return s;
    }

    void yechim() {
        int n = 5;
        System.out.println("S = " + yigindi(n));
    }

    public static void main(String[] args) {
        Pr127 obj = new Pr127();
        obj.yechim();
    }
}
