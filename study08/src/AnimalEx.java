public class AnimalEx {
  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();

    dog.sound();
    cat.sound();
    System.out.println("------------------");

    // 다형성에서 아래를 배운것은 추상클래스에서 사용하기 위함인가?
    // 추상 클래스는 객체 생성 불가능하고 변수만 만들 수 있으니, 변수 만들어서 자식 클래스 객체 대입해서 사용 > 정답!
    // 자식 객체 선언해서 바로쓰면 되지 굳ㄷㄷㄷㄷ이 ,, ?

    // 추상 클래스인 Animal 클래스 타입의 변수 선언
    Animal animal = null;
    // 추상 클래스는 부모 클래스 사용하기 위함
    // 클래스 다형성에 의해서 부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 대입

    animal = new Dog();
    animal.sound();

    animal = new Cat();
    animal.sound();
    System.out.println("------------------");

    // Animal 클래스 타입의 원본은 Dog 클래스 객체 넣기 가능 > 상속
    // 오버라이딩된 sound() 실행
    animalSound(new Dog());
    animalSound(new Cat());
    }
  public static void animalSound(Animal animal){
    animal.sound();
  }
}
