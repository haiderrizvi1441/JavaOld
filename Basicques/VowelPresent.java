public class VowelPresent {

    // To check if vowel is present in String
    static void fnc1(String s){
        char[] vowls = {'a','e','i','o','u'};
        for(int i=0;i<s.length();i++){
            for(int j=0;j<vowls.length;j++){
                if(s.charAt(i) == vowls[j]){
                    System.out.println("vowel found: " + s.charAt(i));
                    break;
                }
            }
        }
        
    }
    public static void main(String[] args){

        fnc1("Hhello");

    }
}
