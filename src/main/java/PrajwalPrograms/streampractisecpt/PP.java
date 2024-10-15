package PrajwalPrograms.streampractisecpt;

public class PP {    //123456  //op-> 214365  // 358779  //op--> 538797

    public static void main(String[] args) {

//        int a[]={1,2,3,4,5,6};

        int a[]={-8,-7,-4,-3,-2,1,3,6};
        int temp=0;

        for(int i=0;i<a.length-1;i++){

            if(a[i+1]>a[i]){
                temp=a[i+1];
                a[i+1]=a[i];
                a[i]=temp;
                i++;
            }
            else {
                i++;
            }

        }

        for(int j:a){
            System.out.print(j+ " ");
        }

    }
}
