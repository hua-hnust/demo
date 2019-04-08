package com.hnust.hua.algorithm;

import java.util.HashMap;
import java.util.Map;

/**   字符串中最长不重复子串
 * Created by Administrator on 2019/4/8.
 */
public class Test20 {

    public static void main(String[] args) {
        System.out.println(maxLength("urabckcfr")==6);
        System.out.println(lengthOfLongestSubstring("urabckcfr")==6);
        System.out.println(maxLength("a")==1);
        System.out.println(maxLength("aaa")==1);
        System.out.println(maxLength("abcdef")==6);
        System.out.println(maxLength("")==0);
        System.out.println(maxLength(null)==0);
    }

    private static int  maxLength(String s) {
        if(s==null || s.length()<=0)
            return 0;
        int preLength=0;  //即f(i-1)
        int curLength=0;  //即f(i)
        int maxLength=0;

        //用于存放字母上次出现的位置
        int[] pos= new int[26];
        for(int i=0;i<pos.length;i++)
            pos[i]=-1;
        for(int i=0;i<s.length();i++) {
            int letterNumber = s.charAt(i)-'a';
            if(pos[letterNumber]<0 || i-pos[letterNumber]>preLength) {
                curLength=preLength+1;
            }else {
                curLength=i-pos[letterNumber];
            }
            pos[letterNumber]=i;
            if(curLength>maxLength)
                maxLength=curLength;
            preLength=curLength;
        }
        return maxLength;
    }

    private static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}
