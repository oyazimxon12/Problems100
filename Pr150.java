
public class Pr150 {
    void yechim() {
        String str = "Salom Dunyo";
        String natija = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
            }
            natija += c;
        }
        System.out.println(natija);
    }

    public static void main(String[] args) {
        Pr150 obj = new Pr150();
        obj.yechim();
    }
}
