public class Fibonacci{
    static long Fibonacci(long n){
        if((n==0) || (n==1))
            return 1;
        else{
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }
     public static void main(String []args){
        System.out.println(Fibonacci(10));
     }
}
