package Questions.StringsQuestions;

public class twoSumMediumLevel {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        twoSum(arr, target);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int p1 = 0;
        int p2 = numbers.length - 1;
        int[] arr = new int[2];
        while (p2 > p1) {
            System.out.println(numbers[p1] + numbers[p2]);
            if (numbers[p1] + numbers[p2] == target) {
                arr[0] = p1 + 1;
                arr[1] = p2 + 1;
                break;
            } else if (numbers[p1] + numbers[p2] > target) {
                // if sum is greater than target we move the pointer towards left coz its a
                // sorted array so moving the pointer will decrese the sum value and we move
                // closer to the target sum
                p2--;

            } else {
                // if sum is less than target we move towards right to get bigger value or array
                // to be compared
                p1++;
            }
        }
        for (int i : arr) {
            System.out.print(i);

        }
        return arr;
    }
}
