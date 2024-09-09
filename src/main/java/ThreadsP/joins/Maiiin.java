package ThreadsP.joins;

public class Maiiin {

    public static int lengthOfLongestSubstring(String s) {

        int max=0;
        int count=1;

        for(int i=0;i< s.length()-1;i++){

            for(int j=i+1;j<s.length();j++){

                if(s.charAt(i)!=s.charAt(j)){
                    count++;
                }
                if(count>max){
                    max=count;
                }
                if(s.charAt(i)==s.charAt(j)){
                    count=1;
                    break;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int i = lengthOfLongestSubstring("abcabcbb");
        System.out.println(i);
    }
}
