import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
  public static void main(String[] args) {
    // Queue 타입의 변수 선언 및 LinkedList 타입의 객체 선언
    Queue<Message> msgQue = new LinkedList<>(); // <> 있어도되고 없어도되고

    // offer : 큐에 데이터 추가
    msgQue.offer(new Message("sendMail","카리나"));
    msgQue.offer(new Message("sendSMS","윈터"));
    msgQue.offer(new Message("sendKakaoTalk","지젤"));
    msgQue.offer(new Message("sendDM","닝닝"));

    // 선입선출
    // poll : 큐에서 데이터 꺼냄
    while (!msgQue.isEmpty()) {
      Message msg = msgQue.poll();
      switch (msg.command){
        case "sendMail":
          System.out.println(msg.to + "님에게 메일을 보냅니다");
          break;
        case "sendSMS" :
          System.out.println(msg.to + "님에게 SMS를 보냅니다");
          break;
        case "sendKakaoTalk":
          System.out.println(msg.to + "님에게 kakaotalk을 보냅니다");
          break;
        case "sendDM" :
          System.out.println(msg.to +"님에게 DM을 보냅니다");
          break;
      }
    }
  }
}
