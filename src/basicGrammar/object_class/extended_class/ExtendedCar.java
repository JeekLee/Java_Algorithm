package src.basicGrammar.object_class.extended_class;

public class ExtendedCar extends Car {
    ExtendedCar(){
        super();
    }
    ExtendedCar(String company){
        super(company);
    }
    ExtendedCar(String company, String model){
        super(company, model);
    }
    ExtendedCar(String company, String model, String color){
        super(company, model, color);
    }
    ExtendedCar(String company, String model, String color, int maxSpeed){
        super(company, model, color, maxSpeed);
    }

    void car_ex1(){
        System.out.println("Class Extend Example1");
    }
    void car_ex2(){
        System.out.println("Class Extend Example2");
    }
    void car_ex3(){
        System.out.println("Class Extend Example3");
    }
    @Override
    int calcTime(int distance){
        return distance/this.maxSpeed + 400;
    }
}
