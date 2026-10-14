
public class Pr148 {
    void yechim() {
        String str = "ab12++--";
        int soni = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) soni++;
        }
        if (soni * 2 == str.length()) {
            System.out.println("Ok");
        } else {
            System.out.println("error");
        }
    }

    public static void main(String[] args) {
        Pr148 obj = new Pr148();
        obj.yechim();
    }
}
