package BubbleSort;

public class Main {

    public static void main(String[] args){
        int [] arr = {3,1,5,4,2,0};
        System.out.println(arr.length-1);
        // 2 for loops
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }



       for(int i  :arr){
           System.out.print(i);
       }
    }
}
