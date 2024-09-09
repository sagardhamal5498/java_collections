package PrajwalPrograms.streampractiseArray4;

import java.util.Arrays;

public class Aimpimp {//find the longest streak length like 100,101,.. =5 ans

    static int streak(int []a) {

        Arrays.sort(a);

        int longestStreak=1;
        int currentStreak=1;

        for(int i=1;i<a.length;i++){

            if(a[i]==a[i-1]+1){
                currentStreak++;
//                if(currentStreak>longestStreak){
//                    longestStreak=currentStreak;
//                }
                longestStreak =Math.max(longestStreak,currentStreak);
            }
            else{
                currentStreak=1;
            }

        }
        return longestStreak;

    }

    public static void main(String[] args) {

        int[] arr = {100, 4, 101, 1, 3, 2,5,6,102,103,104,105,106,107};

        int streak = streak(arr);
        System.out.println(streak);

    }


}
