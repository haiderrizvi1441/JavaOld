public class ReverseAString {
    
    // To reverse a given string 

    static void fnc1(String s){
        StringBuilder sb = new StringBuilder();
        int len = s.length()-1;
        for(int i=0;i<=len;i++){
            sb.insert(i,s.charAt(len-i));
            System.out.println(s.charAt(len-i));
            
        }
        System.out.println(sb);
    }
    public static void main(String[] args){
        fnc1("mrofni ot si sihT");

    }
}