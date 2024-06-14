import java.io.*;

public class BufferedOutputStreamEx {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = null;
    FileOutputStream fos = null;
    BufferedInputStream bis = null;
    BufferedOutputStream bos = null;

    int data = -1;
    long start = 0;
    long end = 0;

    // FileInputStream을 사용하여 이미지파일 열기
    fis = new FileInputStream("C:\\fullstack405\\forest.jpg");

    // BufferedInputStream 사용하여 버퍼로 이미지를 읽어옴
    bis = new BufferedInputStream(fis);

    //FileoutputStream을 사용하여 쓰기를 진행할 파일 위치를 지정
    fos = new FileOutputStream("C:\\fullstack405\\java\\forest1.jpg");

    // 시작시간 확인
    start = System.currentTimeMillis();

    // 버퍼에서 실제 데이터를 읽어옴
    while((data = bis.read()) != -1){
      // FileoutputStream을 사용하여 실제로 파일을 지정한 위치에 씀
      fos.write(data);
    }
    // 버퍼 비우고 닫아줌
    fos.flush();
    fos.close();
    bis.close();
    fis.close();

    // 종료시간 확인
    end = System.currentTimeMillis();
    System.out.println("버퍼 미 사용 시 : " + (end - start) + "ms");

    fis = new FileInputStream("C:\\fullstack405\\forest.jpg");
    bis = new BufferedInputStream(fis);
    fos = new FileOutputStream("C:\\fullstack405\\java\\forest2.jpg");

    // BufferedOutputStream 사용하여 파일 쓰기 준비
    bos = new BufferedOutputStream(fos);

    start = System.currentTimeMillis();
    // BufferedOutputStream를 사용하여 실제로 파일 내용 읽어오기
    while((data = bis.read()) != -1){
      // BufferedOutputStream 사용하여 실제로 파일을 씀
      bos.write(data);
    }
    // 버퍼 비우고 닫음
    bos.flush();
    bos.close();
    fos.close();
    bis.close();
    fis.close();

    end = System.currentTimeMillis();


    System.out.println("버퍼 사용 시 : " + (end - start) + "ms");
  }
}
