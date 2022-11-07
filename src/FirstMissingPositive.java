import java.util.Arrays;

public class FirstMissingPositive {
    /*
    Given an unsorted integer array nums, return the smallest missing positive integer.

    You must implement an algorithm that runs in O(n) time and uses constant extra space.
     */
    public static void main(String[] args) {
        //int[] arr = {1,2,0};
        int[] arr = {3,4,-1,1};
        //int[] arr= {7,8,9,11,5,12};
        Arrays.sort(arr);
        int lastNumber = arr[arr.length-1];
        int index = arr.length-1;
        boolean varYok = false;
        int kayip = 0;
        while (index>0){
            if (lastNumber == arr[index]){
                varYok = true;
            }
            else {
                varYok = false;
            }
            if (!varYok){
                kayip = lastNumber;
                break;
            }
            index--;
            lastNumber--;
        }
        System.out.println(kayip);
    }
}