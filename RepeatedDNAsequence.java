/*
 * The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.

For example, "ACGAATTCCG" is a DNA sequence.
When studying DNA, it is useful to identify repeated sequences within the DNA.

Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order.

 

Example 1:

Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
Output: ["AAAAACCCCC","CCCCCAAAAA"]
Example 2:

Input: s = "AAAAAAAAAAAAA"
Output: ["AAAAAAAAAA"]
 */
public class RepeatedDNAsequence {
    // Using Set
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>();
        Set<String> li = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String subString = s.substring(i, i + 10);
            if (!set.contains(subString)) {
                set.add(subString);
            } else {
                li.add(subString);
            }
        }
        return new ArrayList(li);
    }

    // Using HashMap
    public List<String> findRepeatedDnaSequences2(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String subString = s.substring(i, i + 10);
            map.put(subString, map.getOrDefault(subString, 0) + 1);
        }
        List<String> li = new ArrayList<>();
        // for(Map.Entry<String, Integer> item : map.entrySet()){
        // if(item.getValue > 1){
        // li.add(item.getKey());
        // }
        // }
        for (String str : map.keySet()) {
            if (map.get(str) > 1) {
                li.add(str);
            }
        }
        return li;
    }
}
