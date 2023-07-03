package ch16.practice.pro08;

@FunctionalInterface
public interface Function<T> {
    public double apply(T t);
}
