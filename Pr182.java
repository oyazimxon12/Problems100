
public class Pr182 {
    void yechim() {
        String str = "foundation";
        for (int i = 0; i < str.length(); i += 2) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pr182 obj = new Pr182();
        obj.yechim();
    }
}
