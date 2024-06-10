// pack2 패키지
package pack2;

import pack1.B;

// pack2 패키지에 포함된 C 클래스
public class C {
  // pack1 패키지에 포함된 A 클래스 타입의 변수 a 선언, 오류 O
  // A 클래스는 defualt 타입, 동일한 패키지가 아니면 접근할 수 없음
//  A a;

  // pack1 패키지에 포함된 B 클래스 타입의 변수 b 선언, 오류 X
  // public 타입, 다른 패키지에서 사용 가능
  B b;
}
