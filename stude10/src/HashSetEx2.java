import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
  public static void main(String[] args) {
    // HashSet 타입의 객체 생성
    Set<Member> set = new HashSet();

    // HashSet 데이터 추가
    // new를 사용해 생성한 객체라서 서로 다른 주소를 참조함
    // Member 클래스에서 오버라이딩한 부분 때문에 동일한 값으로 인식함
    set.add(new Member("민지",20));
    set.add(new Member("민지",20));

    System.out.println("총 객체 수 : " + set.size());

  }
}
