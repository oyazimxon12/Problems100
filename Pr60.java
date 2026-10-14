public class Pr60 {
    static private int n = 12;
  static private int k = 8;
   static int quotient(){
       int res = 0;
       while (n>=k){
           n = n-k;
           res++;
       }
       return res;
   }
    static int remainder(){
       while (n>=k){
          n=n-k;
       }
       return n;
   }
}
