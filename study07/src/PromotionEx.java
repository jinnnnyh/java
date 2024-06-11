public class PromotionEx {
  public static void main(String[] args) {
    // 각각의 자식 클래스 타입의 객체를 생성

    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E();

    // 최상위 부모 클래스인 A 클래스 타입의 변수를 선언
    // 자식 타입의 객체를 부모인 A 클래스 타입의 변수에 대입
    A a1 = b;
    A a2 = c;
    A a3 = d; // 최하위 타입의 객체이지만 상속 관계에 있기 때문에 최상위 클래스 타입의 변수에 대입 가능
    A a4 = e;

    // 부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 대입
    B b1 = b;
    C c1 = c;

    // B 클래스와 E 클래스는 상속관계가 아니기 때문에 B 클래스 타입의 변수에 E 클래스 타입의 객체를 대입할 수 없음
    // C 클래스와 D 클래스 이하 동일
//    B b2 = e;
//    C c2 = d;
  }
}
