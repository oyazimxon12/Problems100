
public class Pr168 {
    void yechim() {
        String str = "Salom134131@$199";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(c >= '0' && c <= '9')) System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pr168 obj = new Pr168();
        obj.yechim();
    }
}
