// LC 344
class Solution {
    public void reverseString(char[] s) {
        if(s.length == 1) return;
        int left = 0; 
        int right = s.length - 1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left ++;
            right --;
        }
    }
}
// Time: O(N), Space: O(1)

// LC 541

class Solution {
    public String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        for(int i = 0; i < str.length; i += 2 * k){
            int left = i;
            int right = Math.min(str.length - 1,left + 
             k - 1);
            while(left < right){
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left ++;
                right --;
            }
        }
        return new String(str);
    }
}
// Time: O(N), Space: O(N)
