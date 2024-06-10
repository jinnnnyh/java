public class KoreanEx {
  public static void main(String[] args) {

    Korean k1 = new Korean();
    System.out.println("k1.nation : "+k1.nation);
    System.out.println("k1.name : "+k1.name);
    System.out.println("k1.ssn : "+k1.ssn);

    // 필드초기화 1)
    // 객체 사용 전 필요한 데이터를 필드에 직접 입력
    k1.nation = "한국";
    k1.name = "박성호";
    k1.ssn = "020000-456413";

    System.out.println("k1.nation : "+k1.nation);
    System.out.println("k1.name : "+k1.name);
    System.out.println("k1.ssn : "+k1.ssn);

    // 필드초기화 2)
    // 객체 사용 전 필요한 데이터를 필드에 초기화하는 메소드를 호출하여 초기화
    Korean k2 = new Korean();
    // 객체 생성후 필드 초기화 메소드 호출
    k2.setData();

    System.out.println("k2.nation : "+k2.nation);
    System.out.println("k2.name : "+k2.name);
    System.out.println("k2.ssn : "+k2.ssn);

    // 필드초기화 3)
    // 생성자를 통해 매개변수를 받고 필드를 초기화
    Korean k3 = new Korean("홍길동","1111-1111");

    System.out.println("k3.nation : "+k3.nation);
    System.out.println("k3.name : "+k3.name);
    System.out.println("k3.ssn : "+k3.ssn);



  }
}
