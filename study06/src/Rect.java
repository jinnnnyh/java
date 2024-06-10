public class Rect {
  private int width, height;

  // 생성자
  public Rect(int width, int height) {
    // 매개변수로 받은 데이터로 필드 초기화
    this.width = width;
    this.height = height;
  }

  public int getArea(){
    return width * height;
  }
}
