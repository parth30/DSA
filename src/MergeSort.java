import java.util.Scanner;

public class MergeSort {
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
        MergeSort_Impl(array,0, array.length-1);
        for(int i : array){
            System.out.print(i+" ");
        }
    }

    private static void MergeSort_Impl(int[] array,int left,int right) {
        if(left<right) {
            int mid = (left + right) / 2;
            MergeSort_Impl(array, left, mid);
            MergeSort_Impl(array, mid+1, right);
            Merge(array, left, mid, right);
        }
    }

    private static void Merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int[] left_array = new int[n1];
        int n2 = right - mid;

        int[] right_array = new int[n2];

        for (int i = 0; i < n1; i++) {
            left_array[i] = array[left+i];
        }
        for (int i = 0; i < n2; i++) {
            right_array[i] = array[mid+i+1];
        }

        int k = left , l= 0 , r= 0;
        while(l< n1 && r< n2){
            if(left_array[l]<=right_array[r]){
                array[k] = left_array[l];
                l++;
            }else {
                    array[k] = right_array[r];
                    r++;
            }
            k++;
        }
        for (int i = l; i < n1; i++) {
            array[k]=left_array[i];
            k++;
        }
        for (int i = r; i < n2; i++) {
            array[k]=right_array[i];
            k++;
        }
    }
}
