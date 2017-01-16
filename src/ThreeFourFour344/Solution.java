package ThreeFourFour344;

/**
 * Created by sjchen on 1/16/17.
 */
public class Solution {
    public String reverseString(String s) {
        if(s==null||s.length()<=1) return s;
        char[] temp=s.toCharArray();
        for(int i=0;i<s.length()/2;i++){
            swap(temp,i);
        }
        String newString = new String (temp);
        return newString;
    }

    private void swap(char[] s, int i){
        char t = s[i];
        s[i]=s[s.length-i-1];
        s[s.length-i-1]=t;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseString("hello"));
        System.out.println(solution.reverseString(""));
    }
}