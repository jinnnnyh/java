public class DMBCellphoneEx {
  public static void main(String[] args) {
    // DMBCellphone 클래스 타입의 객체 dmb 생성
    DMBCellphone dmb = new DMBCellphone("자바폰","검정색",10);

    // dmb 객체의 인스턴스 멤버 (필드) 사용
    System.out.println("모델 : " + dmb.model );
    System.out.println("색상 : " + dmb.color );
    System.out.println("채널 : " + dmb.channel);

    // dmb 객체의 인스턴스 멤버 (메소드) 사용
    dmb.powerOn();

    dmb.bell();
    dmb.sendVoice("여보세용");
    dmb.receiveVoice("안녕하세요 박성호 전화 맞나요?");
    dmb.sendVoice(".....아닌데요 잘못거셨습니다");
    dmb.hangUp();

    dmb.turnOnDmb();
    dmb.changeChannelDmb(20);
    dmb.turnOffDmb();

    dmb.powerOff();
  }
}
