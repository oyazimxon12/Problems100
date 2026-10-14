
public class Pr190 {
    void yechim() {
        String str = "Akbar";
        int n = str.length();
        System.out.println("" + str.charAt(0) + str.charAt(n / 2) + str.charAt(n - 1));
    }

    public static void main(String[] args) {
        Pr190 obj = new Pr190();
        obj.yechim();
    }
}
