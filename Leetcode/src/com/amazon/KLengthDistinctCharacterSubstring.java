package com.amazon;

import java.util.List;
import java.util.ArrayList;

public class KLengthDistinctCharacterSubstring {

	public static List<String> numKLenSubstrNoRepeats(String S, int K) {
        int[] cnt = new int[26];
        int ans = 0;
        List<String> result = new ArrayList();
        
        for (int hi = 0, lo = 0; hi < S.length(); ++hi) {
            if (++cnt[S.charAt(hi) - 'a'] == 1) {
                if (hi - lo + 1 == K) {
                    result.add(S.substring(lo, hi+1));
                    --cnt[S.charAt(lo++) - 'a'];
                }
            }else {
                do {
                    --cnt[S.charAt(lo) - 'a'];
                } while (S.charAt(hi) != S.charAt(lo++));
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> result = numKLenSubstrNoRepeats("havefunonleetcode", 5);
		
		for(String s : result) {
			System.out.println(s);
		}
		
		System.out.println(result.size());
	}

}
