class Solution {
    public int lengthOfLastWord(String s) {
        String[] wordsarr = s.trim().split("\\s+");
        List<String> wordList = Arrays.asList(wordsarr);
        String lastword = wordList.get(wordList.size() - 1);
        return lastword.length();
    }
}