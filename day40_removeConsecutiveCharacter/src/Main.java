public class Main {

    //Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.
    static String s = "aabbaaa";//aba
//    static String s = "aabb";//ab



    public static void main(String[] args) {
        System.out.println(removeConsecutiveCharacter(s));
    }

    public static String removeConsecutiveCharacter(String S){
        StringBuilder myString = new StringBuilder();
        char cur = s.charAt(0);
        myString.append(cur);
        for (int i = 0; i < s.length()-1; i++) {
            char next = s.charAt(i+1);
            if(cur!=next){
                cur = next;
                myString.append(cur);
            }
        }
        return myString.toString();
    }

}
