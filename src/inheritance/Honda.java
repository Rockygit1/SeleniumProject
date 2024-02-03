package inheritance;

import static java.lang.System.out;

public class Honda extends Car{

    public void hasAbs(){
        out.println("Inside Honda class");
        out.println( true);
    }


    @Override
    public void numberOfAirbags(){
        out.println("Inside Honda class");
        out.println(4 +" Air Bags");
        hasAc();
    }
}
