public class BasePerson {
    String name;
    int age;

    public BasePerson(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void showInfo(){
        System.out.println("Name: "+name+", Age: "+age);
    }
}
