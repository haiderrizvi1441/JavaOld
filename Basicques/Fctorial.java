public class Fctorial {
    
    // To Give the factorial of the number
    // Using Recursion
    static int fnc1(int n){
        
        if(n <= 1){
            return 1;
        }
        else {return (n * fnc1(n-1));}
    }

    static long fnc2(long n){
        long sum = 1;
        for(int i=1;i<=n;i++){
            sum = sum * (i);
        }

        return sum;
    }

    public static void main(String[] args){

        System.out.println(fnc2(5));
    }
}
