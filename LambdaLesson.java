package lessonfour;

public class LambdaLesson {

  /*public static void main(String[] args) {
    LambdaInter<Integer> inter = Integer::sum;
    LambdaInter<String> inter1 = (x,y) -> x + y;
    System.out.println(inter.calculate(10, 10));
    System.out.println(inter1.calculate("10", "10"));

    LambdaInter t = new LambdaInter() {
      @Override
      public int calculate(int x, int y) {
        return x + y;
      }
    };

    LambdaInter inter = (a, b) -> 0;
    LambdaInter inter1 = (a, b) -> a - b;
    LambdaInter inter2 = (a, b) -> a * b;
    LambdaInter inter3 = (a, b) -> a / b;

    int sum = inter.calculate(10, 2);
    int diference = inter1.calculate(10, 2);
    int multiplay = inter2.calculate(10, 2);
    int divided = inter3.calculate(10, 2);
    foo(t, 10, 2);
    foo(inter1, 10, 2);
    foo(inter2, 10, 2);
    foo(inter3, 10, 2);

    inter = x -> {
      return x*x;
    };

  }

  public static void foo(LambdaInter inter, int x, int y) {
    System.out.println(inter.calculate(x, y));
  }

  public void bar() {
    System.out.println("Hello World!");
  }*/

  /*public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9};
    System.out.println(sum(arr, Helper::isEven));
    System.out.println(sum(arr, x -> x%2!=0));
    TrustMe<Integer> t = Helper::isPositive;
    System.out.println(sum(arr, t));

    TrustMe<Integer> me = new TrustMe<Integer>() {
      @Override
      public boolean isTrue(Integer t) {
        return Helper.isEven(t);
      }
    };
  }*/

  /*private static int sum(int[] arr, TrustMe<Integer> trustMe) {
    int sum = 0;
    for (int a : arr) {
      if (trustMe.isTrue(a)) {
        sum += a;
      }
    }
    return sum;
  }*/

  /*CarBuilder carBuilder = Car::new;
  Car car = carBuilder.createCar("Mers");*/

  /*public static void main(String[] args) {
    LambdaInter func = action(1);
    int a = func.calculate(10, 2);
    System.out.println(a);
    int b = action(2).calculate(10, 2);
    System.out.println(b);

    new Car("Zap")
      .toBeep()
      .start()
      .toBeep()
      .run()
      .toBeep()
      .stop()
      .toBeep();
  }*/

  /*private static LambdaInter action(int i) {
    switch (i){
      case 1: return (x, y) -> x * y;
      case 2: return (x, y) -> x / y;
      case 3: return Integer::sum;
      case 4: return (x, y) -> x - y;
      default: return (x, y) -> 0;
    }
  }*/


}

/*class Helper {
  static boolean isEven(int a) {
    return a % 2 == 0;
  }

  static boolean isPositive(int a) {
    return a > 0;
  }
}*/
