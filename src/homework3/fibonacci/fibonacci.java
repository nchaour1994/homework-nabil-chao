package homework3.fibonacci;

public class fibonacci {
    public static int fib(int n ){
        if(n==0 || n == 1 )
            return n;
        return fib(n-1)+fib(n-2);
    }


    public static void main(String[] args) {
        int res= fib(40);
        System.out.println(res);

    }
}
