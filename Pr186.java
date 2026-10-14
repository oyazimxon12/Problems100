
public class Pr186 {
    boolean unli(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    void yechim() {
        String str = "Salom Dunyo";
        String natija = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (unli(c)) {
                natija += '*';
            } else {
                natija += c;
            }
        }
        System.out.println(natija);
    }

    public static void main(String[] args) {
        Pr186 obj = new Pr186();
        obj.yechim();
    }
}
