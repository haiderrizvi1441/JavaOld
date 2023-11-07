public class Fibbo {
    
    // To print fibboanci numbers 
    // Normal Approach
    static void fnc1(int n){
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<=n;i++){
            int c = a + b;
            a = b;
            b = c;

            System.out.println(c);
        }
    }

    // Using Recursion
    static int fnc2(int n){
        if(n<=1){
            return n;
        }
        return fnc2(n-1) + fnc2(n-2);

    }
    public static void main(String[] args){

        // fnc1(11);
        // Fibbonacci using Recursion
        for(int i=0 ; i<13;i++){
            System.out.println(fnc2(i));
        }

    }
}
