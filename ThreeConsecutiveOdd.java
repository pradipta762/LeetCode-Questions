/*
 * Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.
 

Example 1:

Input: arr = [2,6,4,1]
Output: false
Explanation: There are no three consecutive odds.
Example 2:

Input: arr = [1,2,34,3,4,5,7,23,12]
Output: true
Explanation: [5,7,23] are three consecutive odds.
 */
public class ThreeConsecutiveOdd {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 2; i++){            
            boolean num1 = arr[i] % 2 == 1;
            boolean num2 = arr[i + 1] % 2 == 1;
            boolean num3 = arr[i + 2] % 2 == 1;
            if(num1 && num2 && num3) return true;
        }
        return false;
    }
    public boolean threeConsecutiveOdds2(int[] arr) {
        int n = arr.length;
        if(n < 3) return false;
        else{
            for(int i = 0; i < n - 2; i++){
                if(arr[i] % 2 == 1){
                    if(arr[i + 1] % 2 == 1){
                        if(arr[i + 2] % 2 == 1){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
