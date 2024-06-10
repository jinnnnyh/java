public class StaticBlock {
  // 인스턴스 필드
  int field1;
  // 정적 필드
  static int field2;

  // 정적 초기화 블럭
  static{
  // 정적 초기화 블럭에서는 정적 멤버만 사용할 수 있음. 아래 두개 오류남
//  field1 = 10;
//  method1();
    field2 = 20;
    method2();
  }

  // 인스턴스 메소드
  void method1(){
    System.out.println("인스턴스 멤버인 메소드 method1 호출");
  }

  // 정적 메소드
  static void method2(){
    System.out.println("정적 멤버인 메소드 method2 호출");
  }

  // 정적 메소드
  static void method3(){
    // 정적 메소드에서 this 키워드 사용 불가
    // this는 객체 자신을 의미하는데 정적 멤버는 클래스를 통해서 접근하는 멤버이기 때문에
    // 클래스를 통해서 접근 시 '객체가 생성되어 있는지 알 수 없기 때문'에
    // 객체 자신을 의미하는 this를 사용할 수 없음
//    this.field1 = 10;
//    this.method1();
    field2 = 200;
    method2();
  }
}
