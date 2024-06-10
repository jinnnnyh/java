package pack2;

import pack1.B;

public class CEx {
  public static void main(String[] args) {
//    A a = new A();
//    System.out.println(a.field1);
//    System.out.println(a.method1);
  // A 클래스는 default 접근제한자를 사용하고 있기 때문에 다른 패키지에서 사용이 불가능함
  // A 클래스 생성자, 필드, 메소드도 default 접근제한자를 사용하기 때문에 다른 패키지에서 생성자에 접근할 수 없음

    B b = new B();
    System.out.println(b.field2);
    b.method2();
    // B 클래스는 생성자, 필드, 메소드에 모두 public 접근제한자를 사용하여 아무런 제한없이 사용할 수 있음
    
    // D 클래스는 public 접근제한자를 사용하여 외부에서 사용 가능
    D d = new D();
    // D 클래스의 필드인 field4는 private 접근제한자를 사용하여 외부에서 접근 불가
//    System.out.println(d.field4);
    
    // D 클래스의 메소드 method4는 private 접근제한자를 사용하여 외부에서 접근 불가
//    d.method4();
    
    // D 클래스의 메소드 print()는 default 접근제한자를 사용하여 동일 패키지일 경우 외부에서 사용 가능
    // print() 메소드는 D 클래스의 멤버이므로 동일한 멤버인 field4, method4()를 사용할 수 있음
    d.print();
  }
}

// 클래스가 default 접근제한자이면 안에 멤버가 public 이어도 다른 패키지에서는 사용 못함
// 이중 클래스인 경우 해당 상위 클래스에서만 사용할 수 있도록 할 때 default 쓰기도 함