public class Solution {
    public String replaceSpace(StringBuffer str){
        String sti = str.toString();
        char[] chars = sti.toCharArray();
        StringBuffer res = new StringBuffer();
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == ' ')
                res.append("%20");
            else
                res.append(chars[i]);
        }
        return res.toString();
    }
}

