public class Main{
    public static void main(String[] args){
        Car mycar = new Car("Toyota", 160);

        mycar.showInfo();

       int carSpeed = mycar.getSpeed();
       System.out.println("Returned speed from method: " + carSpeed);
    }
}