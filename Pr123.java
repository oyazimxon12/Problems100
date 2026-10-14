public class Pr123 {
    static int EKUB(){
        int a  = 6;
        int b = 9;
        while (b != 0){
            int qoldiq = a % b;
            a = b;
            b = qoldiq;
        }
        return a;
    }


    public static void main(String[] args){
        System.out.println(Pr123.EKUB());
    }
}
