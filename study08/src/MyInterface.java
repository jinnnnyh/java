public interface MyInterface {
  // 추상 메소드
  // 상속받는 클래스에서 반드시 오버라이딩 해야함
  public void method1();

  // 디폴트 메소드
  // 상속받는 클래스에서 필요시에 오버라이딩 가능
  public default void method2() {
    System.out.println("MyInterface.method2 호출");
  }

}
