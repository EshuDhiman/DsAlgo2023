package Concepts.BubbleSort;

class BubbleSortCode {
    static void bsCode(int a[], int n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < n - 1; j++) {
                int temp ;
                
                    if (a[j] > a[j + 1]) {
                        temp = a[j + 1];
                        a[j + 1] = a[j];
                        a[j] = temp;
                    }

                

            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}

public class BubbleSort {
    public static void main(String args[]) {
        int[] arr = { 3, 1, 5, 4, 2,99,0,2323,21,-1 };
        int n = arr.length;
        BubbleSortCode.bsCode(arr,n);
    }
}
