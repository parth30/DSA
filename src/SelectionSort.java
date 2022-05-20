import java.util.Scanner;

public class SelectionSort {

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
        SelectionSort_Impl(array);
        for(int i : array){
            System.out.print(i+" ");
        }
    }

    private static void SelectionSort_Impl(int[] array) {
        int min,min_index;

        for (int i = 0; i < array.length ; i++) {
            min_index=i;
            min=array[i];
            for (int j = i; j < array.length ; j++) {
                if(array[j]<min){
                    min_index=j;
                    min=array[j];
                }
            }
            int temp = array[i];
            array[i] = array[min_index];
            array[min_index]= temp;
        }



    }
}
