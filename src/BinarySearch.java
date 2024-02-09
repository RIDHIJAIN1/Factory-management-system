public class BinarySearch {

    public static void main(String[] args) {
        int[] data = {1,3,35,56,67,88,90,95};
        int match = 56;
        int answer = BinaryAlgorithm(data,match);
        System.out.println(answer);


    }

    static int BinaryAlgorithm(int[]array , int target){
        int start = 0;
        int end = array.length -1;

        while (start <= end){
            int mid = start + (end-start)/2;

            if(target<array[mid]){
                end = mid-1;
            }
            else if(target>array[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
  return -1;
    }
}
