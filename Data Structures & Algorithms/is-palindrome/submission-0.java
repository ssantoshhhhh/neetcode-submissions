class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String clean = "";
        for(int i=0;i<s.length();i++){
        char c = s.charAt(i);

        if(c>= 'a' && c<= 'z' || c>= '0' && c<= '9'){
            clean = clean + c;
        }
        }

        int left = 0;
        int right = clean.length()-1;

        while(left<right){
            if(clean.charAt(left) != clean.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
