
public class Pr137 {
    void yechim() {
        int[] sonlar = {1, 2, 2, 7, 6};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            int x = sonlar[i];
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2 && x != max1) {
                max2 = x;
            }
        }
        System.out.println(max2);
    }

    public static void main(String[] args) {
        Pr137 obj = new Pr137();
        obj.yechim();
    }
}
