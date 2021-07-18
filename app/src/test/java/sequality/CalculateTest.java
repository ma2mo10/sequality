package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testStr() {
    App classUnderTest = new App();

    int x[] = new int[10];
    int y[] = { 2, 3 };

    // 1から10までの配列を生成
    for (int i = 1; i <= 10; i++) {
      x[i - 1] = i;
    }

    String teststr1 = "Sum of 2 and 3 is 5. Average is 2.5.";
    String teststr2 = "Sum of 1 to 10 is 55. Average is 5.5.";
    String teststr = "Sum of odd of 1 to 10 is 25. Sum of even is 30.";
    assertEquals(teststr1, classUnderTest.getSum(y));
    assertEquals(teststr2, classUnderTest.getSum2(x));

    assertEquals(teststr, classUnderTest.getParity(x));
  }

  @Test
  public void testCalc() {
    Calculate calculate = new Calculate();

    int x[] = new int[10];
    int y[] = { 2, 3 };

    int expected_sum1 = 5;
    int expected_sum2 = 55;
    double expected_ave1 = 2.5;
    double expected_ave2 = 5.5;
    int expected_even = 30;
    int expected_odd = 25;

    // 1から10までの配列を生成
    for (int i = 1; i <= 10; i++) {
      x[i - 1] = i;
    }

    assertEquals(expected_sum1, calculate.sum(y));
    assertEquals(expected_sum2, calculate.sum(x));
    assertEquals(expected_even, calculate.evensum(x));
    assertEquals(expected_odd, calculate.oddsum(x));

  }
}
