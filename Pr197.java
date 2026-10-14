
public class Pr197 {
    void yechim() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.print((char) ('A' + i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pr197 obj = new Pr197();
        obj.yechim();
    }
}
