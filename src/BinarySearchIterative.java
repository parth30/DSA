import java.util.Scanner;

public class BinarySearchIterative {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count, key;
        int[] array;
        System.out.println("Enter the number of elements");
        count = sc.nextInt();
        System.out.println("Enter the Key to find");
        key = sc.nextInt();
        array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
        }

        int result = SearchElement_BinarySearch(array,key);
        if(result ==-1){
            System.out.println("Element Not found");
        }else{
            System.out.println("Element found at index "+ result);
        }

    }

    private static int SearchElement_BinarySearch(int[] array, int key) {
        int left=0,right=array.length-1;
        int mid;
        while(left<=right){
            mid=(left+right)/2; // use left+(right-left)/2  so overcome the overflow senario

            if(array[mid]==key){
                return  mid;
            }

            if(array[mid]<key){
                left =mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }

}
