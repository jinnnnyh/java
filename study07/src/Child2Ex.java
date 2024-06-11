public class Child2Ex {
  public static void main(String[] args) {
    // 겉모양은 Parent2 타입이지만 , 알맹이는 Child2 타입의 객체
    Parent2 parent2 = new Child2();
    parent2.field = "데이터 1";
    parent2.method1();
    parent2.method2();

    // 오류남
//    parent2.field2 = "데이터 2";
//    parent2.method3();

    // Child 클래스에만 있는 멤버 사용하고 싶다
//    Child2 child2 = parent2; 오류남
    Child2 child2 = (Child2)parent2; // 강제 타입 변환
    // 그냥 Child2 객체 생성해서 사용하면 안됨 ????????????????????????????
    child2.method3();
    child2.field2 = "데이터 2";

  }
}
