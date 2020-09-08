package lessonfour;

import java.util.function.*;

public class IncludeFunctionalInter<T, K> {

  Predicate<T> predicate;
  Consumer<T> consumer;
  Function<T, K> function;
  Supplier<T> supplier;
  UnaryOperator<T> unaryOperator;
  BinaryOperator<T> binaryOperator;


  public static void main(String[] args) {

    Predicate<Integer> isPositive = x -> x > 0;
    System.out.println(isPositive.test(5));
    System.out.println(isPositive.test(-8));

    Consumer<Integer> print = System.out::println;
    print.accept(1000500);

    Function<Integer, String> function = x -> String.valueOf(x) + "string";
    System.out.println(function.apply(10));

    Supplier<Car> carFactory = () -> new Car("Zap");
    Car car = carFactory.get();

    UnaryOperator<Car> multiplai = x -> x;
    System.out.println(multiplai.apply(new Car("Zap")));

    BinaryOperator<Integer> multi = (x, y) -> x * y;
    System.out.println(multi.apply(5, 2));
  }


}
