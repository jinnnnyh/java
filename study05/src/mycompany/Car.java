package mycompany;

// 현재 패키지안에 Engine, SnowTire, BigWidthTire 클래스 없음
// import 사용해서 다른패키지에 있는 클래스를 가져와서 현재 패키지에서 사용할 수 있도록 등록
// 다른 패키지에 존재하는 클래스를 import로 가져와서 등록하면 현재 패키지에 있는 클래스처럼 클래스 이름만 입력하여
// 사용할 수 있음
import hankook.SnowTire;
import hyundai.Engine;
import kumho.BigWidthTire;
import kumho.Tire;
// import hankook.Tire;
// 동일한 이름의 클래스를 import로 가져오면 클래스명이 겹치기 때문에 가져올 수 없음
// 먼저 선언한 것만 사용할 수 있음
// 동시에 사용하려면 나중에 선언한 것은 전체 경로를 다 써야함


// 자주 사용하는 클래스는 import로 가져오고, 사용 빈도가 낮은 클래스는 전체 경로를 입력하여 사용

public class Car {
  // 다른 패키지에 있는 클래스를 가져와서 객체 생성
   Engine engine = new Engine();
   SnowTire snowTire = new SnowTire();
   BigWidthTire bigWidthTire = new BigWidthTire();
   Tire tire = new Tire(); // kumho 패키지

  // 다른 패키지에 있는 클래스를 가져와서 객체 생성
  // 기존에 import를 통해서 가져온 클래스(kumho Tire)와 동일한 이름의 다른 클래스(hankook Tire)를 가져와야 할 경우
  // 해당 클래스의 전체 경로명을 다 입력해야함


   hankook.Tire tire2 = new hankook.Tire();

}
