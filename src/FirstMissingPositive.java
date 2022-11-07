import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstMissingPositive {
    /*
    Given an unsorted integer array nums, return the smallest missing positive integer.
    You must implement an algorithm that runs in O(n) time and uses constant extra space.
    to see question => https://leetcode.com/problems/first-missing-positive/
     */
    public static void main(String[] args) {
        int[] arr= {3,4,-1,1};
        //int[] arr = {1,2,0};
        //int[] arr= {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr));
    }
    private static int firstMissingPositive(int[] arr) {
        List<Integer> arr1 = new ArrayList<>();
        Arrays.sort(arr);
        int lastNumber = arr[arr.length-1];
        int counter = 1;
        boolean minPoz = true;
        for (int i = 0; i < arr.length; i++) {
            arr1.add(arr[i]);
        }
        for (int i = 0; i <arr1.size() ; i++) {
            if (arr1.contains(counter)){
                counter++;
            }
            else{
                break;
            }
        }
        return counter;
    }
}
