
public class Pr191 {
    void yechim() {
        char c = '7';
        if (c >= '0' && c <= '9') {
            System.out.println("RAQAM");
        } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println("HARF");
        } else {
            System.out.println("SIMVOL");
        }
    }

    public static void main(String[] args) {
        Pr191 obj = new Pr191();
        obj.yechim();
    }
}
