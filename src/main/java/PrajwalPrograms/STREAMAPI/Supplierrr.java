package PrajwalPrograms.STREAMAPI;

import java.util.List;
import java.util.function.Supplier;

public class Supplierrr {

    public static void main(String[] args) {

        Supplier<String> sup=() -> "hello bbbb";
//        System.out.println(sup.get());

//        1st way
        List<String> data = List.of();       //"jkk", "tuku"
        String s = data.stream().findAny().orElseGet(sup);
        System.out.println(s);

//        2nd way
        String s1 = data.stream().findAny().orElseGet(() -> "out from here!!");
        System.out.println(s1);

        //inside optional
//        Cricketers cricketers1 = crepo.findById(id).get();
//        int newid=3;
//         Optional<Cricketers> optional = crepo.findById(newid);
//        Cricketers cricketers2 = optional.orElseGet(() -> cricketers1);

        // for throwing exception if id not present
//        VehicleDetails ille = vrepo.findById(id).orElseThrow(
//                () -> new IdnotfoundException("ille")
//        );

    }
}
