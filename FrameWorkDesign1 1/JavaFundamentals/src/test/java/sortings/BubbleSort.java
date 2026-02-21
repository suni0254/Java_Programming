package sortings;

public class BubbleSort {
    public static void main(String[] args) {
//        int arr[] = {7,8,3,1,2};
//
//        for(int i=0; i< arr.length; i++) {
//            for(int j=0; j<arr.length-i-1; j++) {
//                if(arr[j]>arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        for (int i: arr) {
//            System.out.println(i);
//        }

        int arr[] = {4, 3, 5, 1, 9};

        for(int i=0; i< arr.length-1; i++) {
            for(int j=1; j< arr.length-i; j++) {
                if(arr[j-1]>arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i: arr) {
            System.out.println(i);
        }
    }
}
