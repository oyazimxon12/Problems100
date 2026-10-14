
public class Pr129 {
    void yechim() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pr129 obj = new Pr129();
        obj.yechim();
    }
}
