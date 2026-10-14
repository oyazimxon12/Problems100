
public class Pr136 {
    void yechim() {
        char c = 'H';
        if (c >= 'A' && c <= 'Z') {
            System.out.println("Katta harf");
        } else if (c >= 'a' && c <= 'z') {
            System.out.println("Kichik harf");
        } else {
            System.out.println("Harf emas");
        }
    }

    public static void main(String[] args) {
        Pr136 obj = new Pr136();
        obj.yechim();
    }
}
