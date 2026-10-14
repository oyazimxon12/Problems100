
public class Pr195 {
    void yechim() {
        String str = "abc123";
        int harf = 0, raqam = 0, belgi = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) harf++;
            else if (c >= '0' && c <= '9') raqam++;
            else belgi++;
        }
        if (harf == raqam) {
            System.out.println("ok");
        } else {
            System.out.println("error");
        }
    }

    public static void main(String[] args) {
        Pr195 obj = new Pr195();
        obj.yechim();
    }
}
