
public class Pr192 {
    void yechim() {
        int n = 5;
        char belgi = 'A';
        String natija = "";
        for (int i = 1; i <= n; i++) {
            natija += belgi;
        }
        System.out.println("Natija = " + natija);
    }

    public static void main(String[] args) {
        Pr192 obj = new Pr192();
        obj.yechim();
    }
}
