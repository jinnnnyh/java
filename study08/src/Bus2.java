public class Bus2 implements Vehicle2{

  @Override
  public void run() {
    System.out.println("버스가 달립니다");
  }

  // Bus2 전용 메소드
  public void checkfare(){
    System.out.println("승차요금을 확인합니다");
  }
}

// 강제 타입 변환 왜쓰는건지 모르겠어
