package hashMap;
import models.Pair;

import java.util.*;

public class EpiHashMap {

    public static Map<String, List<String>> findAnagrams(List<String> input) {
        Map<String, List<String>> result = new HashMap<>();

        return result;
    }

    // 12.2 is an anonymous letter constructible
    public static Boolean isLetterPossible(String letter, String magazineText){
        return false;
    }

    // 12.3 implement an ISBN Cache


    // implement a custom LRU Cache

    // 12.5 find the nearest repeated entries in an array
    public static Pair<Integer, Integer> findNearestRepeatedEntries(List<Integer> list) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Pair<Integer, Integer> result = new Pair<>(-1, -1);
        for (int idx = 0; idx < list.size(); idx++){
            Integer currElem = list.get(idx);
            if (hashMap.containsKey(currElem)) {
                Integer lastOccurrence = hashMap.get(currElem);
                Integer diff = Math.abs(lastOccurrence - idx);
                if (result.First == -1 || diff < Math.abs(result.First - result.Second)) {
                    result.First = lastOccurrence;
                    result.Second = idx;
                }
            }
            hashMap.put(currElem, idx);
        }

        return result;
    }

    // 12.1 test for palindromic permutation

    // 12.4 compute the LCA, optimizing for close ancestors

    // 12.6 find smallest sub-array covering all values
    public static Pair<Integer, Integer> findSmallestSubArrayCoveringValues(List<Character> seq, Set<Character> keywords) {
        Integer left = 0;
        Integer right = 0;
        HashMap<Character, Integer> charToCountMap = new HashMap<>();
        Pair<Integer, Integer> result = new Pair<>(-1, -1);
        for (Character c : keywords){
            charToCountMap.put(c, 1);
        }

        Integer remainingKeywords = keywords.size();

        while (right < seq.size()){
            Character currChar = seq.get(right);

            if (keywords.contains(currChar)){
                charToCountMap.put( currChar, charToCountMap.get(currChar) - 1);
                if (charToCountMap.get(currChar) >= 0 ){
                    remainingKeywords--;
                }

                while (remainingKeywords.equals(0)) {
                    Character leftElem = seq.get(left);

                    if (charToCountMap.containsKey(leftElem)) {
                        charToCountMap.put( leftElem, charToCountMap.get(leftElem) + 1);

                        if (charToCountMap.get(leftElem) > 0) {
                            remainingKeywords++;
                        }
                    }

                    if (result.First.equals(-1) || Math.abs(right - left) < Math.abs(result.Second - result.First)) {
                        result.First = left;
                        result.Second = right;
                    }

                    left++;
                }
            }
            right++;
        }

        return result;
    }

    // 12.9 find length of the longest contained interval

    //

}
