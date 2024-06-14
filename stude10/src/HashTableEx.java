import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {
  public static void main(String[] args) {
    // Hashtable 타입의 객체 생성
    Map<String, String> map = new Hashtable();

    // put(key, value) : 키와 데이터 저장
    map.put("spring", "1");
    map.put("summer", "2");
    map.put("fall", "3");
    map.put("winter", "4");

    Scanner sc = new Scanner(System.in);

    while(true){
      System.out.println("아이디와 비밀번호를 입력하세요");
      System.out.print("아이디 : ");
      String id = sc.nextLine();

      System.out.print("비밀번호 : ");
      String pw = sc.nextLine();
      System.out.println();

      // containsKey : 키가 있는지 확인
      // get(key) : 키에 저장된 값 나옴
      if(map.containsKey(id)){ // 사용자가 입력한 id(key)가 Hashtable 타입에 저장되어 있는지 확인
        if(map.get(id).equals(pw)){ // 사용자가 입력한 pw가 Hashtable 에 저장된 데이터와 같은지 확인
          System.out.println("로그인 되었습니다");
        break;
        }
        else{
          System.out.println("비밀번호가 일치하지 않습니다");
        }
      }
      else{
        System.out.println("입력하신 아이디가 없습니다");
      }
    }
  }
}
