import java.util.Scanner;

public class BinarySearchRecursive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count, key,left=0,right;
        int[] array;
        System.out.println("Enter the number of elements");
        count = sc.nextInt();
        right=count-1;
        System.out.println("Enter the Key to find");
        key = sc.nextInt();
        array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
        }
        int result = SearchElement_BinarySearch(array,key,left,right);
        if(result ==-1){
            System.out.println("Element Not found");
        }else{
            System.out.println("Element found at index "+ result);
        }
    }

    private static int SearchElement_BinarySearch(int[] array, int key, int left, int right) {

        int mid = left+(right-left)/2;

        if(left>right){
            return -1;
        }
        if(array[mid]==key){
            return mid;
        }
        if(key>array[mid]){
            return SearchElement_BinarySearch(array,key,mid+1,right);
        }
        if(key<array[mid]){
            return SearchElement_BinarySearch(array,key,left,mid-1);
        }

        return -1;
    }
}
