
public class Pr172 {
    void yechim() {
        double x = 32;
        System.out.println("4-darajali ildiz = " + Math.pow(x, 1.0 / 4));
        System.out.println("5-darajali ildiz = " + Math.pow(x, 1.0 / 5));
    }

    public static void main(String[] args) {
        Pr172 obj = new Pr172();
        obj.yechim();
    }
}
