
public class Pr128 {
    void yechim() {
        int a = 2;
        int b = 6;
        for (int i = a + 1; i < b; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pr128 obj = new Pr128();
        obj.yechim();
    }
}
