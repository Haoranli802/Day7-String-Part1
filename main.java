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

class Solution {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        // 1. 每隔 2k 个字符的前 k 个字符进行反转
        for (int i = 0; i< ch.length; i += 2 * k) {
            // 2. 剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符
            // 3. 剩余字符少于 k 个，则将剩余字符全部反转
            reverse(ch, i, Math.min(ch.length, i+ k) - 1);
        }
        return  new String(ch);

    }
    // 定义翻转函数
    public void reverse(char[] ch, int i, int j) {
        for (; i < j; i++, j--) {
            char temp  = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
    }
}

// Time: O(N), Space: O(N)
