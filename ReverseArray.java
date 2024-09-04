public class ReverseArray {
    public static void reverse(int[]number, int start, int end){
        while( start < end){
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;
            start ++;
            end --;
        }
    }
    public static void printArray(int[]number){
        for( int i=0; i<number.length;i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] number = {2,6,8,10};
        printArray(number);
        reverse(number, 0, number.length-1);
        printArray(number);
    }
    
}
