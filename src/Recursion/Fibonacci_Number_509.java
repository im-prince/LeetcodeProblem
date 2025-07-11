package Recursion;

public class Fibonacci_Number_509 {
    public static void main(String[] args) {

        System.out.println(fib(5));
    }
   static public int fib(int n) {

        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }
}
