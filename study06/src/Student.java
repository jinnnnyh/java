// People 클래스를 상속받아 사용하는 student 클래스
public class Student extends People{
  public int studentNo;
  // 부모 클래스인 People 클래스에서 상속받은 필드 name, ssn이 존재함
  // 부모 클래스의 생성자를 통해서 초기화된 필드(name, ssn)를 자식 클래스인 Student가 상속받아 사용함

  // 자식 클래스 안에 아무것도 없어도 부모 클래스의 멤버가 다 상속되어 있어서 사용 가능 !!

  // 생성자
  public Student(String name, String ssn, int studentNo){
    super(name, ssn);
    // 부모 클래스의 생성자를 호출하는 명령어
    // 매개변수 2개 들어가는 생성자를 호출해서 name, ssn 저장한걸 상속받아서 사용함

    this.studentNo = studentNo;
  }
}

// 부모 클래스의 기본 생성자가 있을 경우 자식 클래스의 생성자에서 super()를 생략해도 오류가 나지 않는다
// 컴파일러가 자동으로 부모 생성자를 호출하는 super()를 추가하기때문

///// 그럼 super(name, ssn) 없고 그냥 super() 들어가면 name, ssn은 어떻게 저장되는거지 ? 매개변수로 받기만하고 저장은 안되는건가
// ㅇㅇ 궁금하면 주석처리하고 실행해보면 됨
// 그냥 오류만 안나게 해줄뿐 데이터가 저장되는건 studentNo 뿐임

