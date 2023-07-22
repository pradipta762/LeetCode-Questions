/*
 * Given an integer n, return the number of prime numbers that are strictly less than n.

 

Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:

Input: n = 0
Output: 0
Example 3:

Input: n = 1
Output: 0

* REFER TO THE LINK TO UNDERSTAND BETTER : https://youtu.be/5LMkddl2NCk
 */
public class COUNT_PRIME {

    // Using  Sieve of Eratosthenes algorithm
    public int countPrimes(int n) {
        if(n < 2) return 0;
        boolean[] composite = new boolean[n];
        int limit = (int)Math.sqrt(n);
        for(int i = 2; i <= limit; i++){
            if(composite[i] == false){
                // Mark all the composite of i as true
                // First index to be changed is i * i
                for(int j = i*i; j < n; j += i){
                    composite[j] = true;
                }
            }
        }

        int count = 0;
        for(int i = 2; i < n; i++){
            if(composite[i] == false) count++;
        }
        return count;
    }
}
