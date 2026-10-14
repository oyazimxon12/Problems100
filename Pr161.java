
public class Pr161 {
    void yechim() {
        String str = "Salom134131@$nima";
        int soni = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) soni++;
        }
        System.out.println(soni);
    }

    public static void main(String[] args) {
        Pr161 obj = new Pr161();
        obj.yechim();
    }
}
