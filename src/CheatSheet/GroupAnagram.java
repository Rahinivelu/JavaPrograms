package CheatSheet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static List<List<String>> anagram(Map<Integer,List<String>> chars){

        List<List<String>> result=new ArrayList<>();
          for(List<String> values:chars.values())
               result.add(values);

          return result;
    }
    public static void main(String[] args){
        String []words={"eat","tea","tan","ate","nat","bat"};
        int nos[]={2,3,5,7,11,13,17,19,23,29,31,37,39,41,43,47,53,59,61,71,73,79,83,97,101,103};

        Map<Integer, List<String>> map=new HashMap<>();

        for(String letter:words){
            int prod=1;
            for(int i=0;i<letter.length();i++){
                prod*=nos[letter.charAt(i)-'a'];
            }

            if(map.containsKey(prod)){
                map.get(prod).add(letter);
            }else{
                map.put(prod,new ArrayList<>());
                map.get(prod).add(letter);
            }
        }
       System.out.println( anagram(map));


    }
}
/**
 * class Solution {
 *     public List<List<String>> groupAnagrams(String[] strs) {
 *
 *         if(strs==null|| strs.length==0)
 *                return null;
 *         int nos[]={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
 *
 *         Map<Integer,List<String>> box=new HashMap<>();
 *         for(String word:strs)
 *         {
 *             int prod=1;
 *             for(int i=0;i<word.length();i++){
 *                 prod*=nos[word.charAt(i)-'a'];
 *             }
 *             if(box.containsKey(prod)){
 *                 box.get(prod).add(word);
 *             }else{
 *                 box.put(prod,new ArrayList<>());
 *                 box.get(prod).add(word);
 *             }
 *         }
 *
 *
 *         List<List<String>> result=new ArrayList<>();
 *         for(List<String> map:box.values())
 *               result.add(map);
 *         return result;
 *     }
 * }
 */