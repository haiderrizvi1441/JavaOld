public class SecondHighest {
    
    // To return second highest in the array
    static int fnc1(int[] arr){
        int high = 0;
        int sechigh = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[high] < arr[i]){
                sechigh = arr[high];
                high = i;
            }
            else if(arr[i] > sechigh){
                sechigh = arr[i];
            }
            System.out.println("sechigh: " + sechigh + " ,high : " + arr[high]);
        }
        return sechigh;
    }

    public static void main(String[] args){

        int[] arr = {5,4,7,1,10,3,0,8};
        System.out.println(fnc1(arr));

    }
}
