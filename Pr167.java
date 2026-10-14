
public class Pr167 {
    void yechim() {
        int a = 10;
        int b = 3;
        System.out.println(a == 7 || b == 7 || a + b == 7 || Math.abs(a - b) == 7);
    }

    public static void main(String[] args) {
        Pr167 obj = new Pr167();
        obj.yechim();
    }
}
