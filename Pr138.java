
public class Pr138 {
    void yechim() {
        String str = "FoundationF65-72";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pr138 obj = new Pr138();
        obj.yechim();
    }
}
