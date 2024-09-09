package PrajwalPrograms.practise;

public class B {  //count how many pallindromes can be from one string

    static boolean ispalli(String s, int left, int right){

        while(left<right){

            if(s.charAt(left++)!=s.charAt(right--))  return false;

        }
        return true;
    }

    public static int countSubstrings(String s) {

        int count=0;
        int n=s.length();

        for(int i=0;i<n;i++){

            for(int j=i; j<n;j++){

                if(ispalli(s, i, j)) count++;

            }
        }
        return count;
    }

    public static void main(String[] args) {

        String str="aba";

        int res = countSubstrings(str);
        System.out.println(res);

    }
}
