package sequality;

public class Calculate {
  public int sum(int x[]) {
    int ans = 0;

    for (int i = 0; i < x.length; i++) {
      ans = ans + x[i];
    }

    return ans;
  }

  public int oddsum(int x[]) {
    int ans = 0;
    for (int i = 0; i < x.length; i++) {
      if (x[i] % 2 == 1) {
        ans = ans + x[i];
      } else {
        // 処理なし
      }
    }

    return ans;
  }

  public int evensum(int x[]) {
    int ans = 0;
    for (int i = 0; i < x.length; i++) {
      if (x[i] % 2 == 0) {
        ans = ans + x[i];
      } else {
        // 処理なし
      }
    }

    return ans;
  }

  public double ave(int x[]) {

    return (double) sum(x) / x.length;
  }
}
