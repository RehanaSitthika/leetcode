class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        String str="";
        for(String num:arr){
            for(int i=num.length()-1;i>=0;i--){
                str+=num.charAt(i);
            }
            str+=" ";
        }
        return str.trim();
    }
}