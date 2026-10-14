
public class Pr187 {
    boolean unli(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    void yechim() {
        String str = "Salom Dunyo";
        String natija = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            boolean harf = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
            if (harf && !unli(c)) {
                natija += '+';
            } else {
                natija += c;
            }
        }
        System.out.println(natija);
    }

    public static void main(String[] args) {
        Pr187 obj = new Pr187();
        obj.yechim();
    }
}
