
public class Pr143 {
    void yechim() {
        String str = "bobo va baliq";
        String natija = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a') {
                natija += 'b';
            } else if (c == 'b') {
                natija += 'd';
            } else {
                natija += c;
            }
        }
        System.out.println(natija);
    }

    public static void main(String[] args) {
        Pr143 obj = new Pr143();
        obj.yechim();
    }
}
