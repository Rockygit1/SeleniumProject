package inheritance;

public class Car {
    public void numberOfTyres(){
        System.out.println("Inside Car class");
        System.out.println(4 + " Tyres");
    }
    public void hasAc(){
        String str ="sda,sdf";
        String[] str2=str.split(",");
        System.out.println("Inside Car class");
        System.out.println(Boolean.TRUE);
    }
    public void numberOfAirbags(){
        System.out.println("Inside Car class");
        System.out.println(2 +" Air Bags");
    }
}
