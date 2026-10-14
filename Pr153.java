
public class Pr153 {
    void yechim() {
        String str = "+2/fff*8+cc45f";
        int summa = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') summa += c - '0';
        }
        System.out.println(summa);
    }

    public static void main(String[] args) {
        Pr153 obj = new Pr153();
        obj.yechim();
    }
}
