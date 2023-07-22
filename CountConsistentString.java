/*
 * 
 */
public class CountConsistentString{
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(int i = 0; i < words.length; i++){
            boolean flag = true;
            String s = words[i];
            for(int j = 0; j < s.length(); j++){
                if(!allowed.contains(""+s.charAt(j))){
                    flag = false;
                    break;
                } 
            }
            if(flag == true){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        int ans = countConsistentStrings(allowed, words);
        System.out.println(ans);
    }
}