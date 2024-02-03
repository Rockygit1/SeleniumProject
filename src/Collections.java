import Test.WebDriver;
import com.lao.abstraction.Encaps;
import org.openqa.selenium.WebElement;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
    String str = "asdfasdf,asdfasdfasdf,asdfasdfasdf";

       Map<String, Integer> accounts = new HashMap<>();
        accounts.put("Subin", 1  );
        accounts.put("Rajesh", 100000  );
        accounts.put("Cat", 20  );
        accounts.put("Cat", 11  );

        System.out.println(accounts);
        System.out.println(accounts.get("Rajesh"));
        System.out.println(accounts.keySet());
        System.out.println(accounts.values());




//
//
//        List<List<String>> table = new ArrayList<>();
//
//        List<String> row1 = new ArrayList<>();
//        row1.add("A");
//        row1.add("B");
//        row1.add("C");
//        row1.add("L");
//        table.add(row1);
//
//        List<String> row2 = new ArrayList<>();
//        row2.add("D");
//        row2.add("E");
//        row2.add("F");
//        table.add(row2);
//
//        for ( int i=0; i< table.size(); i++){
//            for ( int j=0; j< table.get(i).size(); j++ ){
//                System.out.println(table.get(i).get(j));
//            }
//        }
//
//        System.out.println(table);
    }
}
