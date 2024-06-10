public class Calculator3Ex {
  public static void main(String[] args) {
    Calculator3 cal3 = new Calculator3();
    // 오버로딩으로 선언한 메소드
    cal3.sum(19,20); // int 타입의 매개변수를 가진 sum
    cal3.sum(10L, 20L); // long 타입의 매개변수를 가진 sum
    cal3.sum(10.5f, 20f); // float 타입의 매개변수를 가진 sum
    cal3.sum(1.5d, 1.4d); // double 타입의 매개변수를 가진 sum

  }
}


