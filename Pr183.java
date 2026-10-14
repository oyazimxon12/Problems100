
public class Pr183 {
    void yechim() {
        String str = "+a-b*c1";
        for (int i = 0; i < str.length(); i += 2) {
            char c = str.charAt(i);
            boolean harf = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
            boolean raqam = c >= '0' && c <= '9';
            if (!harf && !raqam) {
                System.out.print(c);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pr183 obj = new Pr183();
        obj.yechim();
    }
}
