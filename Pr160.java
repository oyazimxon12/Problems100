
public class Pr160 {
    void yechim() {
        double a = 3;
        double b = 4;
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Gipotenuza = " + c);
        System.out.println("Yuza = " + a * b / 2);
        System.out.println("Perimetr = " + (a + b + c));
    }

    public static void main(String[] args) {
        Pr160 obj = new Pr160();
        obj.yechim();
    }
}
