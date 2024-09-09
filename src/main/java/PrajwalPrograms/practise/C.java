package PrajwalPrograms.practise;

public class C {

//    Input: s = "abcabcbb"
//    Output: 3
//    Explanation: The answer is "abc", with the length of 3.

    public int lengthOfLongestSubstring(String s){

        StringBuilder st= new StringBuilder();

        for(int i=0;i<s.length()-1;i++){
            st.append(s.charAt(i));
            for(int j=i+1;j<s.length();j++){

                if(s.charAt(i)!=s.charAt(j)){
                    st.append(s.charAt(j));

                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        String s="ajadk";

    }

}
