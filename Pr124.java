
public class Pr124 {
    void yechim() {
        int[] sonlar = {3, 4, 3, 5, -9};
        int soni = 0;
        int i = 0;
        while (sonlar[i] > 0) {
            soni++;
            i++;
        }
        System.out.println(soni);
    }

    public static void main(String[] args) {
        Pr124 obj = new Pr124();
        obj.yechim();
    }
}
