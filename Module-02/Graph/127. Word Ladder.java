class Pair {
    String word;
    int level;

    public Pair(String word, int level) {
        this.word = word;
        this.level = level;
    }
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(beginWord, 1));

        HashSet<String> set = new HashSet<>();

        for(String word: wordList) {
            set.add(word);
        }


        while(q.size() > 0) {
            Pair p = q.remove();

            String word = p.word;
            int level = p.level;

            if (word.equals(endWord)) {
                return level;
            }

            for(int i=0;i<word.length();i++) {
                char ch = word.charAt(i);
                for(int j=0;j<26;j++) {
                    String newWord = word.substring(0,i) + (char)(j+'a') + word.substring(i+1);
                    if (set.contains(newWord)) {
                        q.add(new Pair(newWord, level+1));
                        set.remove(newWord);
                    }
                }
            }
        }

        return 0;
    }
}
