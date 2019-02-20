class Solution1 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        int[] ms = new int[256];
        int[] mt = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            if (ms[s.charAt(i)] != mt[t.charAt(i)])
                return false;
            ms[s.charAt(i)] = i + 1;
            mt[t.charAt(i)] = i + 1;
        }
        return true;
    }
}

class Solution2 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        Map<Character, Character> st = new HashMap<>();
        Map<Character, Character> ts = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(!st.containsKey(sc) && !ts.containsKey(tc)){
                st.put(sc,tc);
                ts.put(tc,sc);
            }
            else if(st.containsKey(sc) && !ts.containsKey(tc)){
                return false;
            }
            else if(!st.containsKey(sc) && ts.containsKey(tc)){
                return false;
            }
            else if(sc != ts.get(tc) || tc != st.get(sc))
                return false;
        }
        
        return true;
    }
}

class Solution3 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        for(int i = 0; i < charS.length; i++){
            if(map.containsKey(charS[i])){
                if(!map.get(charS[i]).equals(charT[i]))
                    return false;
            }
            else if(map.containsValue(charT[i]))
                return false;
            map.put(charS[i], charT[i]);
        }
        
        return true;
    }
}
