package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * @author QiaoWeiBo
 * @date 2022/7/9 12:10 AM
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String res = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(res));
    }

    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        for (int start = 0, end = 0; end < s.length(); ++end) {
            char ch = s.charAt(end);
            // if (m.containsKey(s.charAtet(end))) {//这里为啥会报错呀，问一下楚
            if (m.containsKey(ch)) {
                // start = Math.max(start, m.get(s.charAtet(end)) + 1);
                start = Math.max(start, m.get(ch) + 1);
            }
            res = Math.max(res, end - start + 1);
            // m.put(s.charAtet(end), end);
            m.put(ch, end);
        }
        return res;
    }
}
