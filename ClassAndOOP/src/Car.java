public class Car{
   String brand;
   int speed;
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public void showInfo(){
        System.out.println("Brand: "+brand+",Speed: "+speed+" km/h");
    }
    public int getSpeed(){
        return speed;
    }
}


