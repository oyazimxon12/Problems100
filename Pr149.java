
public class Pr149 {
    void yechim() {
        String str = "12W()34AzzC++";
        String natija = "";
        int soni = 0;
        for (int i = str.length() - 1; i >= 0 && soni < 2; i--) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                natija = c + natija;
                soni++;
            }
        }
        System.out.println(natija);
    }

    public static void main(String[] args) {
        Pr149 obj = new Pr149();
        obj.yechim();
    }
}
