package PrajwalPrograms.streampractisecpt;

public class CC {


    public static void main(String[] args) {

        int a[]={2,3};
        int ls=0;
        int rs=0;

            for (int i = 0; i < a.length; i++) {
                if(a.length==1){
                    System.out.println(0);
                    break;
                }
                else if(a.length>1) {
                    ls = ls + a[i];

                    for (int j = a.length - 1; j > i + 1; j--) {
                        rs = rs + a[j];
                    }

                    if (rs == ls) {
                        System.out.println(i + 1);
                        System.out.println(ls);
                        System.out.println(rs);
                    } else {
                        rs = 0;
                    }
                }
            }



    }
}
