
public class Pr194 {
    int ekub(int a, int b) {
        while (b != 0) {
            int qoldiq = a % b;
            a = b;
            b = qoldiq;
        }
        return a;
    }

    void yechim() {
        String str = "asdg4sadf8";
        int a = -1, b = -1;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                if (a == -1) {
                    a = c - '0';
                } else {
                    b = c - '0';
                    break;
                }
            }
        }
        if (b == -1) {
            System.out.println("Satrda 2 ta raqam yo'q");
        } else if (a == 0 || b == 0) {
            System.out.println("EKUB=" + ekub(a, b) + ", EKUK=0");
        } else {
            System.out.println("EKUB=" + ekub(a, b) + ", EKUK=" + a / ekub(a, b) * b);
        }
    }

    public static void main(String[] args) {
        Pr194 obj = new Pr194();
        obj.yechim();
    }
}
