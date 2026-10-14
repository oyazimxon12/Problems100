public class Pr107 {
    static int n = 5;
    static void dioganal2(){
        for (int i = n; i >=1 ; i--) {
            for (int j = n; j >i ; j--) {
                System.out.print("  ");
            }
            System.out.println(i);
                    }
    }
}
