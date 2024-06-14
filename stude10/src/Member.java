public class Member {
  public String name;
  public int age;

  public Member(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  // 새로운 값이 들어오면 Object 타입의 obj에 저장되고 Member 타입으로 강제 타입 변환해서 같은지 확인함
  public boolean equals(Object obj) {
    if (obj instanceof Member) {
      Member member = (Member) obj;
      return member.name.equals(name) && (member.age == age);
    }
    else{
      return false;
    }
  }

  @Override
  public int hashCode(){
    return name.hashCode() + age;
  }
}
