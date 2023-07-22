public class MergeStringAlternatively {
    public String mergeAlternately1(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while(i < n1 && j < n2){
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        while(i < n1){
            sb.append(word1.charAt(i++));
        }
        while(j < n2){
            sb.append(word2.charAt(j++));
        }
        return sb.toString();
    }

    //Method 2
    public String mergeAlternately2(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while(i < n1 && j < n2){
            sb.append(word1.charAt(i++)).append(word2.charAt(j++));
        }
        if(i < n1){
            sb.append(word1.substring(i));
        }
        if(j < n2){
            sb.append(word2.substring(j));
        }
        return sb.toString();
    }
}
