class Solution {
    public int maxFreqSum(String s) {
        int cons[]=new int[26];
        int vow[]=new int[26];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vow[s.charAt(i)-'a']++;
            }
            else{
                cons[s.charAt(i)-'a']++;
            }
        }
        int max1=0;
        int max2=0;
        for(int i=0;i<26;i++){
            if(max1<vow[i]){
                max1=vow[i];
            }
        }
         for(int i=0;i<26;i++){
            if(max2<cons[i]){
                max2=cons[i];
            }
        }
        return max1+max2;
    }
}