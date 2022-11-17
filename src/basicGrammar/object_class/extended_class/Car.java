package src.basicGrammar.object_class.extended_class;

public class Car {
    // field
    String company;
    String model;
    String color;
    int maxSpeed;
    int speed;

    // constructor, Overloading
    Car() {
        this("현대자동차", "그랜저", "회색", 250);
    }
    Car(String company) {
        this(company, "그랜저", "회색", 250);
    }
    Car(String company, String model) {
        this(company, model, "회색", 250);
    }
    Car(String company, String model, String color) {
        this(company, model, color, 250);
    }
    Car(String company, String model, String color, int maxSpeed) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    // methods
    void powerOn() {
        System.out.println("시동을 켭니다.");
        System.out.println(this.company + "/" + this.model + "/"  + this.color + "/"  + this.maxSpeed);
    }
    void powerOff() {
        System.out.println("시동을 끕니다.");
        System.out.println(this.company + "/" + this.model + "/"  + this.color + "/"  + this.maxSpeed);
    }
    int calcTime(int distance){
        return distance/this.maxSpeed;
    }


}
