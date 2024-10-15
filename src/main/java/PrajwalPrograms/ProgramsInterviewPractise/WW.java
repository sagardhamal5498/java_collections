package PrajwalPrograms.ProgramsInterviewPractise;

import java.math.BigInteger;

public class WW {

    public static void main(String[] args) {

//        String num1, String num2
        String num1="840477629533";
        String num2="498828660196";

        Long i1 = Long.valueOf(num1);
        Long i2 = Long.valueOf(num2);
        long result=i1*i2;

//        String res = String.valueOf(result);
//        System.out.println(res);

        BigInteger bb= BigInteger.valueOf(i1);
        BigInteger bb2 = BigInteger.valueOf(i2);
        BigInteger bb3= bb.multiply(bb2);
        System.out.println(bb3);

    }
}
