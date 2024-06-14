public class MyClassA implements MyInterface {
  //
  @Override
  public void method1() {
    System.out.println("MyClassA.method1 호출");
  }
  // 부모인 인터페이스에 디폴트 메소가 있을 경우 디폴트 메소드는 필요에 따라서 오버라이딩이 가능함
  // 상속받은 디폴트를 메소드를 오버라이딩 없이 그냥 사용해도 됨
}
