
public class Pr189 {
    void yechim() {
        String str = "ab12+-";
        int harf = 0, raqam = 0, belgi = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) harf++;
            else if (c >= '0' && c <= '9') raqam++;
            else belgi++;
        }
        if (harf == raqam && raqam == belgi) {
            System.out.println("Ok");
        } else {
            System.out.println("Not");
        }
    }

    public static void main(String[] args) {
        Pr189 obj = new Pr189();
        obj.yechim();
    }
}
