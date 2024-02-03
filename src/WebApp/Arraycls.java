package WebApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraycls {

    public static void main (String args[]){
        List<String> collectary = new ArrayList<>();
        collectary.add("bmw");
        collectary.add("benz");
        collectary.add("maruti");
        System.out.println(collectary+"full values");
        System.out.println(collectary.get(0));
        collectary.set(2,"Hyundai");
        System.out.println(collectary+"added values");
        collectary.remove(0);

        System.out.println(collectary.size());
        //collectary.clear();

        Iterator itrary = collectary.iterator();
        while(itrary.hasNext()){
            System.out.println(itrary.next());
        }
    }

    private static int collectary(int i) {
        return i;
    }

    public void aryremove(){
        Arraycls objAry = new Arraycls();
    }
}
