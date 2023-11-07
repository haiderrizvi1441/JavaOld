public class Plndrome {
    

    // For Strings
    static void fnc1(String s){
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.insert(i,s.charAt((s.length()-i-1)));
        }
        
        if(sb.toString().matches(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

    // For Integers
    static void fnc2(int n){
        int sum = 0;
        int res = n;
        while(n>0){
            int temp = n%10;
            n /= 10;
            sum = (sum*10) + temp;
            System.out.println("Temp : " + temp);
            System.out.println(sum);
        }

        if(sum == res){
            System.out.println("Palindrome Integer");
        }
        else{
            System.out.println("Not a Palindrome Integer");
        }
    }
    public static void main(String[] args){

        fnc2(2332);

    }
}
