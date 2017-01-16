package FourSixOne;

/**
 * Created by sjchen on 1/16/17.
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingDistance(1,4));
    }

    public int hammingDistance(int x, int y) {
        if(x==y) return 0;
        int max, min;
        if (x >= y) {
            max = x;
            min = y;
        } else {
            max = y;
            min = x;
        }
        int distance = 0;
        while(max>0){
            if(max%2!=min%2)
            {
                distance++;
            }
            max=max/2;
            min=min/2;
        }
        return distance;
    }

    //using JAVA API
    public int hammingDistanceTwo(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

}
