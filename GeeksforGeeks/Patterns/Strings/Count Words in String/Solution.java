class Solution {
    public int countWords(String s) {
        // code here
        String st =s.trim();
       if(st.length()==0){
           return 0;
       }
       String[] str=st.split("\\s+");
       return str.length;
    }
}