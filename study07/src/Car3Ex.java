public class Car3Ex {
  public static void main(String[] args) {
    Car3 car = new Car3();
    for(int i=0; i<=5; i++){
      int problemLocation = car.run();
      if(problemLocation != 0){
        // 배열을 사용한 버전
        System.out.println(car.tires[problemLocation-1].location + "HankookTIre로 교체");
        car.tires[problemLocation-1]= new HankookTire(car.tires[problemLocation-1].location,15);
      }
      System.out.println("------------------------------");
    }
  }
}
