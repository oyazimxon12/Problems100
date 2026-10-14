
public class Pr188 {
    void yechim() {
        String str = "abc123";
        String natija = "";
        for (int i = 0; i < str.length(); i++) {
            natija += (char) (str.charAt(i) + 1);
        }
        System.out.println(natija);
    }

    public static void main(String[] args) {
        Pr188 obj = new Pr188();
        obj.yechim();
    }
}
