class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, List<String>> hash = new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            hash.putIfAbsent(key, new ArrayList<>());
            // get(key) is being used here to fetch the list by using key value and .add(s) is being used here to add the word in the list..
            hash.get(key).add(s);
        }
        return new ArrayList<>(hash.values());

        } 
    }

