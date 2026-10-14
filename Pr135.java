
public class Pr135 {
    void yechim() {
        String str = "C++ lang**23sdsd*";
        int soni = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '*') soni++;
        }
        System.out.println(soni);
    }

    public static void main(String[] args) {
        Pr135 obj = new Pr135();
        obj.yechim();
    }
}
