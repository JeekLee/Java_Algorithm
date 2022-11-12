package basicGrammar.object_class.extended_class;

public class CarExample {
    public static void main(String[] args) {
        // 객체 생성
        Car myCar = new Car("르노삼성");

        // 필드 값 읽기
        System.out.println("-------------------------");
        System.out.println("제작회사:" + myCar.company);
        System.out.println("모델명:" + myCar.model);
        System.out.println("색깔:" + myCar.color);
        System.out.println("최고속도:" + myCar.maxSpeed);
        System.out.println("현재속도:" + myCar.speed);
        System.out.println("-------------------------");

        // method 호출
        myCar.powerOn();
        System.out.println("4000km 주파에 필요한 시간 : " + myCar.calcTime(4000) + "시간");
        myCar.powerOff();
        System.out.println("-------------------------");

        // Extended 객체 생성
        ExtendedCar extendedCar= new ExtendedCar("기아자동차");
        System.out.println("4000km 주파에 필요한 시간 : " + extendedCar.calcTime(4000) + "시간");
    }
}
