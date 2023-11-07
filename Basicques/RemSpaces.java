public class RemSpaces {
    
    // To Remove the all spaces between String
    static void fnc1(String s){
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(arr[i] != ' '){
                sb.append(arr[i]);
            }
        }

        System.out.println(sb.toString());
    }

    // To Remove only the Leading and trailing spaces
    static void fnc2(String s){
        s = s.strip();
        System.out.println(s);

    }


    public static void main(String[] args){

        fnc2("          Helll this is a messge   ");
        

    }
}
