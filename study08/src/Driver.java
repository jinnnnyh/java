public class Driver {
  // Vehicle 인터페이스를 상속받은 클래스만 매개변수에 들어갈 수 있음
  public void drive(Vehicle v) {
    v.run();
  }
}

// 인터페이스를 상속받은 클래스 아님
// 얘를 이용해서 상속받은 클래스들을 불러오는게 간단해보임 ?? 알것같은데 모르겠다 아
