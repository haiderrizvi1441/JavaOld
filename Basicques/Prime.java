public class Prime {
    

    // To check if a number is prime or not
    static boolean fnc1(int n){
        // 0 and 1 are not prime
        if(n<=1){
            return false;
        }
        if(n<=3){
            return true;
        }
        // For more than 3
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        // If no divisors are found it is a prime number
        return true; 
    }
    public static void main(String[] args){

        for(int i=0;i<21;i++){
            System.out.println(i + " is prime: ? " + fnc1(i));
        }

    }
}
