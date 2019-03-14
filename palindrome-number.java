class Solution {
    public boolean isPalindrom(int x){
        if(x < 0)
            return false;
        String string = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder(string)；
        if(string.equals(stringBuilder.reverse().toString()))
            return true;
        else
            return false;
    }
}
