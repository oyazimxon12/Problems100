
public class Pr175 {
    void yechim() {
        String str = "Java-2026!";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pr175 obj = new Pr175();
        obj.yechim();
    }
}
