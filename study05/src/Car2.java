public class Car2 {

  public boolean isStop() {
    return stop;
  }

  public void setStop(boolean stop) {
    this.stop = stop;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  // private 접근제한자를 사용한 필드
  // 캡슐화를 통해서 외부에서 접근하지 못하도록 막음
  // 마우스 오른쪽 클릭 > 생성 > getter/setter 자동으로 생성해줌
  private int speed;
  private boolean stop;

  // 외부에서 캡슐화된 필드를 우회하여 사용하도록 getter/setter 제공함
  // 값을 막 변경할 수 없도록하기 위해 사용하는듯?

//  public int getSpeed(){
//    return speed;
//  }
//
//  // public으로 선언된 메소드의 매개변수를 private 변수에 저장해서 사용할 수 있게 함
//  public void setSpeed(int speed){
//    if(speed < 0){
//      this.speed = 0;
//      this.stop = true;
//    }
//    else{
//      this.speed = speed;
//      this.stop = false;
//    }
//  }
//
//  // public으로 선언된 메소드의 매개변수를 private 변수에 저장해서 사용할 수 있게 함
//  public boolean isStop(){
//    return stop; // true, false 반환
//  }
//
//  // public으로 선언된 메소드의 매개변수를 private 변수에 저장해서 사용할 수 있게 함
//  public void setStop(boolean stop){
//    this.stop = stop;
//    this.speed = 0;
//  }
}
