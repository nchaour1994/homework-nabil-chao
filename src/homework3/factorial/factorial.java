package homework3.factorial;

public class factorial {
    public  static int fact(int n ){
        if(n==1)
            return n;
        return n*fact(n-1);
    }
    public  static int fibonacci(int n) {
        if (n == 0 || n == 1 )
            return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }



    public static void main(String[] args) {
          int res=fact(9);
        System.out.println(res);

        int res1=fibonacci(40);
        System.out.println(res1);

    }
}
