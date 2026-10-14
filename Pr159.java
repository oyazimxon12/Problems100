
public class Pr159 {
    void yechim() {
        String str = "Salom Dunyo PDP";
        String natija = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                natija += '*';
            } else {
                natija += c;
            }
        }
        System.out.println(natija);
    }

    public static void main(String[] args) {
        Pr159 obj = new Pr159();
        obj.yechim();
    }
}
