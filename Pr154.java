
public class Pr154 {
    boolean kabisa(int yil) {
        return (yil % 4 == 0 && yil % 100 != 0) || yil % 400 == 0;
    }

    void yechim() {
        int yil = 2024;
        System.out.println(kabisa(yil));
    }

    public static void main(String[] args) {
        Pr154 obj = new Pr154();
        obj.yechim();
    }
}
