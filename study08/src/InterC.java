// InterA, B를 동시에 상속받음
public interface InterC extends InterA, InterB{
  public void methodC();
  // 안보이지만 methodA, methodB 있음
}
