// Day 2 - Second Largest Element in Array
// Time: O(n)  Space: O(1)

public class Second_Largest_Element {

    public static int secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } 
            else if (num > second && num != first) {
                second = num;
            }
        }

        return second;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("Second Largest: " + secondLargest(arr));
    }
}
