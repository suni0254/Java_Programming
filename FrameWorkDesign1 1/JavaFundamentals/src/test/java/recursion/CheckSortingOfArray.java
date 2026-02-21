package recursion;

public class CheckSortingOfArray {
    public static void main(String[] args) {
        int arr[] = {3, 5, 6 , 7, 9};

        if(checkSortingOfArray(arr, 1))
            System.out.println("array is sorted");
        else System.out.println("array is not sorted");
    }
    public static boolean checkSortingOfArray(int arr[], int i) {
        if(i == arr.length)
            return true;
        if(arr[i] < arr[i-1])
            return false;
        return checkSortingOfArray(arr, i+1);
    }
}
