public class Pr110 {
    static void karra(){
        int i = 2;
        while (i <= 9) {
            int j = 1;
            while (j <= 10) {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }
            System.out.println(); // jadvallar orasida bo'sh qator
            i++;
        }
    }
}

