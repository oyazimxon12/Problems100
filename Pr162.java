
public class Pr162 {
    boolean kvadrat(int n) {
        if (n < 0) return false;
        int ildiz = (int) Math.sqrt(n);
        return ildiz * ildiz == n;
    }

    void harfEmaslar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) System.out.print(c);
        }
        System.out.println();
    }

    void yechim() {
        int n = 16;
        System.out.println(kvadrat(n));
        
        String str = "Salom134131@$nima";
        harfEmaslar(str);
    }

    public static void main(String[] args) {
        Pr162 obj = new Pr162();
        obj.yechim();
    }
}
