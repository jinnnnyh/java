public class Television {

  // 정적 필드 선언
  // 정적 필드 선언과 동시에 데이터 입력
  static String company = "Samsung";
  static String model = "OLED";

//  String name;

  // 정적 필드 선언만 함
  static String info ;

  // 초기화 메소드를 따로 선언하는것 보다 간단하게 초기화?

  // 정적 필드인 info를 초기화
  static{
    info = company + " - " + model;

    // 초기화되지 않은 정적 필드인 info에 데이터를 입력하여 초기화
    // 정적 멤버는 정적 멤버만 사용할 수 있음
    // 정적 초기화 블록도 정적 멤버임, 2번 동일
    // name 넣으면 사용할 수 없다고 뜸

    // 객체 자신을 뜻하는 this 사용 불가
    // 객체 생성 안하고 클래스를 사용하기 때문
  }
}
