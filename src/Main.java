import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {


        int[] arr = {1, 21, 3, 4, 5};
//        int target = 2;
        System.out.println(maxNumber(arr));


    }

//    static int linearSearch(int []array , int match){
//
//        if (array.length ==0){
//            return  -1;
//        }
//        for (int i =0 ; i<array.length; i++){
//            int element = array[i];
//
//            if(element == match){
//                return i;
//            }
//        }
//        return -1;
//    }

    static  int maxNumber(int[]array ){
//     int maxi;
     if (array.length==0){
         System.out.println("No maximum number detected");
     }
        int max = array[0];
     for (int i=1;i<array.length;i++){

       int index = array[i];
         if (index > max) {
             max = index;
         }

     }
return max;
    }
};



