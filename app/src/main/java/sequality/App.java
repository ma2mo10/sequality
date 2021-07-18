/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
  public String getGreeting() {

    return "Hello World!";

  }

  public String getSum(int x[]) {
    Calculate calculate = new Calculate();

    int sum = calculate.sum(x);
    double ave = calculate.ave(x);

    return "Sum of 2 and 3 is " + String.valueOf(sum) + ". Average is " + String.valueOf(ave) + ".";
  }

  public String getSum2(int x[]) {
    Calculate calculate = new Calculate();

    int sum = calculate.sum(x);
    double ave = calculate.ave(x);

    return "Sum of 1 to 10 is " + String.valueOf(sum) + ". Average is " + String.valueOf(ave) + ".";
  }

  public String getParity(int x[]) {
    Calculate calculate = new Calculate();

    int EvenSum = calculate.evensum(x);
    int OddSum = calculate.oddsum(x);

    return "Sum of odd of 1 to 10 is " + String.valueOf(OddSum) + ". Sum of even is " + String.valueOf(EvenSum) + ".";
  }

  public static void main(String[] args) {
    int x[] = new int[10];
    int y[] = { 2, 3 };

    // 1から10までの配列を生成
    for (int i = 1; i <= 10; i++) {
      x[i - 1] = i;
    }

    System.out.println(new App().getGreeting());

    System.out.println(new App().getSum(y));
    System.out.println(new App().getSum2(x));
    System.out.println(new App().getParity(x));

  }
}
