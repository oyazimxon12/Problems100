public class Pr61 {
    static int num = 44;
    static boolean Even(){
        while (num>0){
            int digit = num%10;
            if (digit%2==0){
            return true;
        }
            num = num/10;
        }
        return false;
    }
}
