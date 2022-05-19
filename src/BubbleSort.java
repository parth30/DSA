import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        int count;
        int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        count= sc.nextInt();
        array = new int[count];
        for (int i = 0; i <count ; i++) {
            array[i]= sc.nextInt();
        }
        BubbleSort_Impl(array);
        for(int i : array){
            System.out.print(i+" ");
        }
    }

    private static void BubbleSort_Impl(int[] array) {
        int count = array.length;
        while(count>1 ){
            for (int i = 1; i < count ; ++i) {
                if(array[i]<array[i-1]){
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                }
            }
            --count;
        }



    }

}
