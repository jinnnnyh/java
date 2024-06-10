public class Singleton {
  
  // Singleton 클래스 타입의 변수 instance 선언
  // new 키워드로 생성자를 호출하여 Singleton 타입의 객체 생성
  // static 키워드를 사용하여 정적 멤버로 선언
  // 데이터를 모두 함께 공유함
  // 클래스명을 통해서 접근 가능
  // private 접근 제한자를 사용하여 외부에서 사용 불가능(직접 접근X)으로 막음
  
  private static Singleton instance = new Singleton();
  // 객체 instance는 여기서만 사용가능 Ex 클래스에서는 사용 X 
  // 사용하려면 getInstance를 통해서 사용해야함
  
  // private 접근 제한자를 사용하여 외부에서 생성자를 호출 못하도록 막음
  private Singleton() {}
  
  // public 접근 제한자를 사용하여 외부에서 접근 가능
  // static 키워드를 사용하여 정적 멤버로 사용
  // 잠겨있고 정적멤버인 instance를 정적 메소드인 getInstance는 불러와서 사용 가능

  public static Singleton getInstance() {
    return instance;
  }
}
