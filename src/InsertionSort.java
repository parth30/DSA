import java.util.Scanner;

public class InsertionSort {

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
        InsertionSort_Impl(array);
        for(int i : array){
            System.out.print(i+" ");
        }
    }

    private static void InsertionSort_Impl(int[] array) {

        for (int i = 1; i < array.length; i++) {
            for (int j = i-1; j >=0 ; j--) {
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }else{
                    break;
                }

            }
        }

    }

}
