package pureFunction.longestString;

import java.util.HashMap;

public class PureFunctionLongestString {
    public static void main(String[] args) {
        String[] arr0 = {"aaaa", "bbbb", "cccc"};
        String[] arr1 = {"aaaaa", "aa", "a"};
        String[] arr2 = {"aaaa", "bbbbbb", "bbb"};

        System.out.println(longestString(arr0, arr0.length, new HashMap<Character, Integer>()).toString());
        System.out.println(longestString(arr1, arr1.length, new HashMap<Character, Integer>()).toString());
        System.out.println(longestString(arr2, arr2.length, new HashMap<Character, Integer>()).toString());
    }

    public static HashMap<Character, Integer> longestString (String[] arr, int size, HashMap<Character, Integer> identifier) {
        if (size <= 0) {
            return identifier;
        }
        String arrElem = arr[size-1];
        int arrStrength = arrElem.length();
        Character elemContainment = arrElem.charAt(0);

        if (identifier.containsKey(elemContainment)) {
            int mapStrength = identifier.get(elemContainment);
            if (mapStrength < arrStrength) {
                identifier.put(elemContainment, arrStrength);
            }
        } else {
                identifier.put(elemContainment, arrStrength);
        }
        return  longestString(arr, size-1, identifier);
    }
}
