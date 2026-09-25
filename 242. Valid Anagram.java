import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        char[]s1 = s.toCharArray();
        char[]t1 = t.toCharArray();
        if(s1.length!=t1.length){
            return false;
        }
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1,t1);
    }
}
