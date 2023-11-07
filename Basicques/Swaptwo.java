public class Swaptwo {
    
    // Swap 2 numbers without declaring 3rd

    static void fnc1(int x, int y){
        x = x +y;
        y = x-y;
        x = x-y;

        System.out.println("x is: " + x);
        System.out.println("y is: " + y);
    }
    public static void main(String[] args){

        fnc1(55,-1);

        
    }
}
