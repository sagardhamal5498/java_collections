package PrajwalPrograms.ProgramsInterviewPractise;

public class Prime {

    public static void main(String[] args) {

        int a[]={1,2,3,4,5,6,7,8};
        boolean flag=true;
        int result[]=new int[a.length];
        int index=0;

        for(int i=0;i<a.length;i++){

//            System.out.println(flag);
            for(int j=2;j<=a[i]/2;j++){

                if(a[i]%j==0){
                    flag=false;
                    break;
                }
            }

//            System.out.println(a[i]+ " "+flag);
//
            if(flag){
//                System.out.println(a[i]);
                result[index]=a[i];
                index++;
            }
            flag=true;
        }

        for(int x:result){

            if(x%2!=0 && x!=0){
                System.out.println(x);
            }
        }


    }
}
