public class Car3 {
  // 기존에는 Tire 클래스 타입의 변수와 객체를 각각 4개 생성
  // 비슷한 데이터를 여러개 사용하므로 배열을 선언하여 사용하는 것이 효과적

  // Trie 클래스 타입의 배열 tires 를 선언과 동시에 초기화
  Tire[] tires = {
      new Tire("앞왼쪽", 6),
      new Tire("앞오른쪽", 2),
      new Tire("뒤왼쪽", 3),
      new Tire("뒤오른쪽", 4)
  };

  int run(){
    System.out.println("[자동차가 달립니다]");
    // 기존 if 문 4개로 확인

    // for 문 사용하여 if 문 반복실행, 인데스 순서대로 확인
    for(int i = 0; i< tires.length; i++){
      if (tires[i].roll() == false) {
        stop();
        return (i+1); // case 값이 1부터 시작하므로 +1 하고 반환
      }
    }
    return 0;
  }


  void stop(){
    System.out.println("[자동차가 멈춥니다]");
  }
}



