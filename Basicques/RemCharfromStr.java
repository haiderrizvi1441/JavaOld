public class RemCharfromStr {
    

    // To Remove the given char from the string 
    static void fnc1(char c, String s){
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != c){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString())   ;

    }
    public static void main(String[] args){

        fnc1('i',"Hello This is karma");
        
    }
}
