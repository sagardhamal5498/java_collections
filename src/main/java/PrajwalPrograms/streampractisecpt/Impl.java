package PrajwalPrograms.streampractisecpt;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Impl {

//    Group transactions by their category.
//    Summarize the total amount spent per category.

    public static void main(String[] args) {

        List<Transaction> data = List.of(
                new Transaction(1, 50.0, "Grocery"),
                new Transaction(2, 100.0, "Electronics"),
                new Transaction(3, 75.0, "Grocery"),
                new Transaction(4, 200.0, "Electronics")
        );

        Map<String, Double> collect = data.stream().collect(Collectors.groupingBy(x -> x.getCategory(), Collectors.summingDouble(Transaction::getAmount)));
        System.out.println(collect);

    }
}
