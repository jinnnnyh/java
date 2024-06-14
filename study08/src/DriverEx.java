public class DriverEx {
  public static void main(String[] args) {
    Bus bus = new Bus();
    bus.run();
    Taxi taxi = new Taxi();
    taxi.run();

    System.out.println();

    // 인터페이스, 인터페이스를 상속받은 클래스 제외한 제 3의 클래스를 생성해서 실행문을 작성하는게 뭔가 간단해보이긴함

    Driver d = new Driver();
    d.drive(bus);
    d.drive(taxi);
  }
}
