public class PersonEx {
  public static void main(String[] args) {
    // 객체의 매개변수로 필드 초기화
    // ssn은 final 변수
    Person p1 = new Person("123456-1234567", "홍길동");

    System.out.println(p1.nation);
    System.out.println(p1.ssn);
    System.out.println(p1.name);

    System.out.println();

    // 아래 두 개 오류남
    // 한 번 초기화된 final 필드의 값은 수정할 수 없음
//    p1.nation = "USA";
//    p1.ssn = "11111-55555";

    // 일반 필드인 name 수정 가능
    p1.name = "김첨지";
    System.out.println(p1.name);
  }
}
