public class ElseIfEx {
    public static void main(String[] args) {
        int score = 85;

        if(score >= 90){
            System.out.println("점수가 90~100 사이 입니다");
            System.out.println("등급은 A입니다");
        }
        else if(score >= 80){
            System.out.println("점수가 80~89 사이 입니다");
            System.out.println("등급은 B입니다");
        }

        System.out.println();

        int money = 5000;
        System.out.println("중화요리점에 갑니다");
        System.out.println("자장면을 주문합니다");
        if(money >= 15000){
            System.out.println("군만두를 주문합니다");
        }
        else if (money >= 5000){
            System.out.println("짜장면만 먹습니다");
        }




    }
}
