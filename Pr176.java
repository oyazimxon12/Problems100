
public class Pr176 {
    void yechim() {
        String str = "12+34=46";
        boolean natija = true;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) natija = false;
        }
        System.out.println(natija);
    }

    public static void main(String[] args) {
        Pr176 obj = new Pr176();
        obj.yechim();
    }
}
