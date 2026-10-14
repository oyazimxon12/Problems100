
public class Pr158 {
    boolean parolTogri(String p) {
        boolean kichik = false, yulduzcha = false, raqam = false;
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (c >= 'a' && c <= 'z') kichik = true;
            if (c == '*') yulduzcha = true;
            if (c >= '0' && c <= '9') raqam = true;
        }
        return p.length() >= 8 && kichik && yulduzcha && raqam;
    }

    void yechim() {
        String parol = "parol*123";
        if (parolTogri(parol)) {
            System.out.println("Parol to'g'ri");
        } else {
            System.out.println("Parol shartlarga mos emas");
        }
    }

    public static void main(String[] args) {
        Pr158 obj = new Pr158();
        obj.yechim();
    }
}
