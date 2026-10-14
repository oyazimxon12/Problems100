
public class Pr157 {
    void yechim() {
        String str = "Salom Dunyo";
        String natija = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
            }
            natija += c;
        }
        System.out.println(natija);
    }

    public static void main(String[] args) {
        Pr157 obj = new Pr157();
        obj.yechim();
    }
}
