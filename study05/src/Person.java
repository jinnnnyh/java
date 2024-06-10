public class Person {

  final String nation = "korea"; // final 필드 선언과 동시에 데이터 입력
  final String ssn; // final 필드 선언만 함
  // 아래 처럼 데이터 입력하면 person 생성자 매개변수 못받음, 초기화 못함
//  final String ssn = "12534-456132";

  String name; // 일반 필드로 선언

  // 생성자 선언
  // 객체의 매개변수로 필드 초기화
  public Person(String ssn, String name) {
    this.ssn = ssn; // 생성자 안에서 final 필드를 초기화
    this.name = name; // 일반 필드 초기화
  }

}

