
public class Pr144 {
    void yechim() {
        String str = "13553";
        int soni = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '5') soni++;
        }
        System.out.println(soni);
    }

    public static void main(String[] args) {
        Pr144 obj = new Pr144();
        obj.yechim();
    }
}
