package PrajwalPrograms.lambdasExpression.predicate;

@FunctionalInterface
public interface Pred<T> {

    boolean test(T t);
}
