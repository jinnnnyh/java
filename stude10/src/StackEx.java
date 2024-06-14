import java.util.Stack;

public class StackEx {
  public static void main(String[] args) {
    // Stack 클래스 타입의 객체 생성
    Stack<Coin> coinBox = new Stack();

    // Stack에 데이터 추가
    coinBox.push(new Coin(100));
    coinBox.push(new Coin(50));
    coinBox.push(new Coin(500));
    coinBox.push(new Coin(10));

    // 후입선출
    while(!coinBox.isEmpty()) {
      // pop 으로 꺼낸 값 coin에 저장
      Coin coin = coinBox.pop();
      System.out.println("꺼내온 동전 : " + coin.getValue());
    }
  }
}
