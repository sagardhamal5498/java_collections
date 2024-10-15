package PrajwalPrograms.ProgramsInterviewPractise;

public class MImp {

    public static void main(String[] args) {

        int given=8;
        int newcandle=3;

        int bc=given;
        int uc=0;
        int bw=given;
//        int count=0;

        while(newcandle>0){
            bc=bc+uc;
            uc= bw/newcandle;
            if(uc>0){
                    bw = bw - (uc * newcandle) + uc;
            }
            else {
                    break;
            }
        }
        System.out.println(bc);
    }
}
//input =
//givencandles =  7  //
//newcandle    =  4  //can make 1 new candle after 4 burnt wax
//
//burnt candle   = 0
//unburnt candle = 0
//burnt wax      = 0
//
////1 st
//
//bc =7
//uc =0
//bw =7
//
// 2nd
//
//bc=7
//uc=1
//bw=3    //after burning 1 uc :- 3+1
//
// 3rd
//
//bc=7  =>8  =>9
//uc=0  =>1  =>0
//bw=4  =>0  =>0+1
//
//4th
//
//bc=9
//uc=0
//bw=1


