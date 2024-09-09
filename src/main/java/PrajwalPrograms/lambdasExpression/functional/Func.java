package PrajwalPrograms.lambdasExpression.functional;

@FunctionalInterface
public interface Func<P,Q> {

    Q apply(P p);
}
