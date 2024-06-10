public class SingletonEx {
  public static void main(String[] args) {
    // 생성자 호출하려고 하면 오류남
    // Singleton 클래스의 생성자에 private 접근 제한자를 사용하여 생성자를
    // 외부(다른 클래스)에서 호출할 수 없음
//    Singleton s1 = new Singleton();

    // 사용하려면 getInstance() 사용해야함
    Singleton obj1 = Singleton.getInstance();
    Singleton obj2 = Singleton.getInstance();

    if(obj1 == obj2) {
      System.out.println("obj1 과 obj2는 같은 객체");
    }
    else {
      System.out.println("obj1 과 obj2는 다른 객체");
    }



  }
}
