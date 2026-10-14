
public class Pr196 {
    void yechim() {
        String str = "ab+-1234";
        int harf = 0, raqam = 0, belgi = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) harf++;
            else if (c >= '0' && c <= '9') raqam++;
            else belgi++;
        }
        if ((harf + belgi) * 2 == str.length()) {
            System.out.println("ok");
        } else {
            System.out.println("error");
        }
    }

    public static void main(String[] args) {
        Pr196 obj = new Pr196();
        obj.yechim();
    }
}
