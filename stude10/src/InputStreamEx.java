import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {
  public static void main(String[] args) {
    InputStream is = null;
    try{
      //InputStream으로 파일 열기
      is = new FileInputStream("C:\\fullstack405\\java\\test1.txt");
      // InputStream이 byte 타입으로 데이터를 가져옴
      int readByte = 0; // 가져온 byte 타입의 데이터를 저장할 변수

      while(true){
        // read() : 1byte 씩 데이터 가져오기, 더이상 가져올 데이터가 없으면 -1 출력
        // 바이트 수를 지정 안하면 한글자 ? Ex2랑 비교해서 좀더 생각해보자
        readByte = is.read(); // 한글자 가져오고
        if(readByte == -1) {
          break;
        }
        // 읽어온 데이터 화면 출력, int 타입으로 저장했는데 char 타입으로 강제 타입 변환
        System.out.println((char)readByte);
      }
    }
    catch (IOException e){
      System.out.println(e.getMessage());
    }
    finally {
      try{
        if(is != null){is.close();}
      }
      catch (Exception e){ }
    }

  }
}
