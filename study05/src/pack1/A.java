// pack1 패키지
package pack1;

// pack1 패키지에 포함된 클래스 A
// 접근제한자가 명시되어있지않다 >> default로 설정되어 있음
// default로 설정되어 있으면 동일한 패키지 내에서만 사용가능
class A {
  // 접근제한자가 없으므로 접근제한자 default 사용

  String field1 = "a 클래스의 field";

  void method1(){
    System.out.println("a 클래스의 method1() 호출");
  }
}
