package lessonfour;


@FunctionalInterface
public interface TrustMe<T> {
  boolean isTrue(T t);
}
