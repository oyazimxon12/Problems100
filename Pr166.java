
public class Pr166 {
    void yechim() {
        String str = "PDP Academy";
        int katta = 0, kichik = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') katta++;
            else if (c >= 'a' && c <= 'z') kichik++;
        }
        if (katta > kichik) {
            System.out.println("PDP");
        } else {
            System.out.println("ACADEMY");
        }
    }

    public static void main(String[] args) {
        Pr166 obj = new Pr166();
        obj.yechim();
    }
}
