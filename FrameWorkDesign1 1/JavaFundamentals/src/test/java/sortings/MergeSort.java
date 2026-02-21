package sortings;

public class MergeSort {
    public static void main(String[] args) {

        int arr[] = {7, 9, 4, 3, 8, 1};
        int si = 0;
        int n = arr.length;
        divide(0, arr, n-1);

        for(int i:arr) {
            System.out.print(i + " ");
        }
    }

    public static void divide(int si, int arr[], int ei) {
        if(si >= ei){
            return;
        }
        int mi = si+(ei-si)/2;
        divide(si, arr, mi);
        divide(mi+1, arr, ei);
        conquer(arr, si, mi, ei);
    }

    public static void conquer(int arr[], int si, int mi, int ei) {
        int merged[] = new int[ei-si+1];

        int index1 = si;
        int index2 = mi+1;
        int x = 0;

        while(index1<=mi && index2<=ei) {
            if(arr[index1] < arr[index2]) {
                merged[x++] = arr[index1++];
            }
            else {
                merged[x++] = arr[index2++];
            }
        }

        while(index1<=mi) {
            merged[x++] = arr[index1++];
        }
        while(index2<=ei) {
            merged[x++] = arr[index2++];
        }

        for(int i=0, j=si; i<merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
}
