
public class Pr152 {
    void yechim() {
        String str = "45ds4587d45ds6d54ds54d";
        int soni = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') soni++;
        }
        if (soni > 8) {
            System.out.println("PDP");
        } else {
            System.out.println("ACADEMY");
        }
    }

    public static void main(String[] args) {
        Pr152 obj = new Pr152();
        obj.yechim();
    }
}
