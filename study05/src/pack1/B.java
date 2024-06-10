// pack1 패키지
package pack1;

// pack1 패키지에 포함된 B 클래스
public class B {
  // 동일한 패키지에 포함된 A 클래스 타입의 변수 a를 선언, 오류X
  A a;

  // 접근제한자 public  사용
  public String field2 = "b 클래스의 field2";
  public void method2(){
    System.out.println("b 클래스의 method2() 호출");
  }

}
