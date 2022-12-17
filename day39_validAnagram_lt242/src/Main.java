import java.util.Arrays;

public class Main {

    static String s="anagram";
    static String t = "nagaram";

    public static void main(String[] args) {
        System.out.println(validAnagramBest(s,t));
    }

    //approach sorting
    //time o(N log N) space o(N)
    static boolean validAnagram(String s,String t){
        if(s.length() == t.length()){
            char[] sArray = s.toCharArray();
            char[] tArray = t.toCharArray();

            Arrays.sort(sArray);
            Arrays.sort(tArray);

            return Arrays.equals(sArray,tArray);

        }
        return false;
    }

    //time o(N) space o(1)
    //using ascii too save memory
    static boolean validAnagramBest(String s,String t){
        if(s.length() != t.length())
            return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length() ; i++) {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }


        for (int i: count) {
            if (i!=0){
                return false;
            }
        }

        return true;


    }


}
