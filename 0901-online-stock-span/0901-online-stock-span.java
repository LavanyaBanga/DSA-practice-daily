import java.util.Stack;

class StockSpanner {

  Stack<int[]> a = new Stack<>();

  public int next(int price) {
    int span = 1;

    while (!a.isEmpty() && a.peek()[0] <= price) {
      span += a.pop()[1];
    }

   
    a.push(new int[]{price, span});

    return span;
  }
}
