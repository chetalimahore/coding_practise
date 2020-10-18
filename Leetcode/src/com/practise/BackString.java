import java.util.*;

class Solution {
    //not working solution

//    public boolean backspaceCompare(String S, String T) {
//
//        int maxSize = S.length() >= T.length() ? S.length() : T.length();
//        char stack[] = new char[maxSize];
//        int stackIndex = 0;
//
//        for(int i = 0 ; i < S.length() ; i++)
//        {
//            if(S.charAt(i) != '#')
//            {
//                stack[stackIndex++] = S.charAt(i);
//            }
//            else
//            {
//                if(stackIndex != 0)
//                {
//                    stackIndex--;
//                    stack[stackIndex] = ' ';
//                }
//            }
//        }
//        stackIndex--;
//
//        for(int i = T.length()-1 ; i >= 0; i--)
//        {
//            if(T.charAt(i) == '#')
//            {
//                i--;
//            }
//
//            else if(T.charAt(i) == stack[stackIndex])
//            {
//                stack[stackIndex] = ' ';
//                --stackIndex;
//            }
//        }
//
//        if(stackIndex == -1)
//        {
//            return true;
//        }
//
//        return false;
//    }

        public boolean backspaceCompare(String S, String T) {
            int numberOfCharsToIgnore = 0;
            int i = S.length() - 1;
            int j = T.length() - 1;

            while (true) {
                numberOfCharsToIgnore = 0;
                while (i >= 0 && (numberOfCharsToIgnore > 0 || S.charAt(i) == '#')) {
                    numberOfCharsToIgnore += S.charAt(i) == '#' ? 1 : -1;
                    i--;
                }
                numberOfCharsToIgnore = 0;
                while (j >= 0 && (numberOfCharsToIgnore > 0 || T.charAt(j) == '#')) {
                    numberOfCharsToIgnore += T.charAt(j) == '#' ? 1 : -1;
                    j--;
                }
                if (i >= 0 && j >= 0 && S.charAt(i) == T.charAt(j)) {
                    i--;
                    j--;
                } else {
                    break;
                }
            }

            return i == -1 && j == -1;

        }
}
