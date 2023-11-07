package javaeighttheo;

import java.util.ArrayList;

public class lambda {
    
    static int twice(int x){
        return (2*x);
    }
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(10);
        numbers.add(155);
        numbers.add(13);
        numbers.add(17);
        // Format : (x) ->{fx};
        numbers.forEach((x) -> {System.out.println(twice(x));});
    }
}
