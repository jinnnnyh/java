import java.util.HashMap;
import java.util.Map;

public class HashMapEx2 {
  public static void main(String[] args) {
    // key 를 Member 클래스 타입으로 지정
    Map<Member, Integer> map = new HashMap();

    // new를 사용해 생성한 객체라서 서로 다른 주소를 참조함
    // Member 클래스에서 오버라이딩한 부분 때문에 동일한 값으로 인식함
    map.put(new Member("김선우",27),1);
    map.put(new Member("김선우",27),1);

    // 기존은 put(값) 인데 이 예제에서는 new 로 새로운 객체 만들어서 넣고 내용물이 같은지 확인함(Member 클래스에 확인하는 코드 있음)
    // 실제로는 서로 다른 주소를 참조하는 다른 객체지만 내용물이 같아서 같은 객체로 인식함
    System.out.println("총 저장 수 : " + map.size());

  }
}
