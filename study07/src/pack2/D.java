package pack2;

import pack1.A;

// 다른 패키지에 있는 A 클래스를 상속받아 사용하는 D 클래스
public class D extends A {
  public D(){
    // 부모 클래스인 A 클래스의 생성자 호출
    // A 클래스의 생성자는 protected 접근제한자를 가지고 있어서 다른 패키지에 있는 D 클래스가 사용할 수 없음
    // but! A 클래스와 D 클래스는 상속관계 : D 클래스에서 A 클래스의 생성자, 멤버에 접근 가능함
    super();

    // A 클래스의 멤버 field, method 사용함
    this.field = "상속 관계 field 에서 접근";
    this.method();
  }
}
