
public class Pr181 {
    void yechim() {
        String str = "a9b7";
        int summa = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') summa += c - '0';
        }
        System.out.println("Yig'indi = " + summa);
        System.out.println("Kvadrat ildizi = " + Math.sqrt(summa));
    }

    public static void main(String[] args) {
        Pr181 obj = new Pr181();
        obj.yechim();
    }
}
