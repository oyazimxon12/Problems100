
public class Pr165 {
    void yechim() {
        String str = "foundation";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pr165 obj = new Pr165();
        obj.yechim();
    }
}
