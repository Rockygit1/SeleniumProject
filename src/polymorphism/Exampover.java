package polymorphism;

public class Exampover extends ExampOO {


@Override
    public void royalhonda(){
    System.out.println("car is japanaese makers not indian");
    }

    public static void main (String args[]) {
        ExampOO newtask = new Exampover();
        newtask.royalhonda();
    }
}
