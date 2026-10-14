
public class Pr171 {
    void yechim() {
        int a = 3, b = 9, c = 1, d = 5;
        int t;
        if (a < b) { t = a; a = b; b = t; }
        if (b < c) { t = b; b = c; c = t; }
        if (c < d) { t = c; c = d; d = t; }
        if (a < b) { t = a; a = b; b = t; }
        if (b < c) { t = b; b = c; c = t; }
        if (a < b) { t = a; a = b; b = t; }
        System.out.println(a + " " + b + " " + c + " " + d);
    }

    public static void main(String[] args) {
        Pr171 obj = new Pr171();
        obj.yechim();
    }
}
