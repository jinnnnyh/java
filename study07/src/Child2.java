public class Child2 extends Parent2{
  // Parent2 클래스에서 상속받은 필드 field가 존재
  public String field2;

  // 자식 클래스에만 있는 메소드
  public void method3(){
    System.out.println("Child2 - method3 호출");
  }
  // method3을 호출하고 싶으면 강제 타입 변환 쓰라는건가 ?
}
