
public class Pr177 {
    void yechim() {
        String str = "Salom Dunyo";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') c = (char) (c - 32);
            else if (c >= 'A' && c <= 'Z') c = (char) (c + 32);
            System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pr177 obj = new Pr177();
        obj.yechim();
    }
}
