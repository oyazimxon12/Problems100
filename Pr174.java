
public class Pr174 {
    void yechim() {
        String str = "Java-2026!";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pr174 obj = new Pr174();
        obj.yechim();
    }
}
