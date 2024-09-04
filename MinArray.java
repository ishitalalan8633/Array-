public class MinArray {
    public int FindMin(int[]arr){
        if(arr==null || arr.length==0){
          throw new IllegalArgumentException("Invalid");

        }
        int min = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;

    }
    public static void main(String[] args) {
        int[]arr = {2,5,8,9};
        MinArray ma = new MinArray();
        System.out.println(ma.FindMin(arr));
    }
}
