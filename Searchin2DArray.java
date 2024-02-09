import java.util.Arrays;
public class Searchin2DArray {
    public static void main(String[] args){
        int[][] arr = {
                {11,23,37},
                {22,30,40},
                {44,50,62},
                {60,70,87}
        };
        int target = 60;
        int[] ans = Search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE);
    }
    static int[] Search(int[][] arr,int target){
        for(int row = 0;row < arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                  if(arr[row][col] == target){
                      return new int[]{row,col};
                  }
            }
        }
        return new int[-1];
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] ints : arr){
            for(int element : ints){
                if(element>max){
                    max = element;
                }
            }
        }
        return max;
    }
}
