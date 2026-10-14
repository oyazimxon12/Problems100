
public class Pr180 {
    void yechim() {
        String str = "a2b3c4";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                int raqam = c - '0';
                System.out.print((int) Math.pow(raqam, 2) + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pr180 obj = new Pr180();
        obj.yechim();
    }
}
