import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

public class Samplecode {
    public static void main(String args[]) {
        int a, b, c;
        a = 10;
        b = 20;
        c = a + b;
        System.out.println(c);

        if (a > b) {
            System.out.println("a is greatest");
        } else {
            System.out.println("b is greatest");
        }
    }

    public void Rajubhai() {
        String expres="a";

        switch (expres) {
            case "a":
                System.out.println("rajesh");
            case "b":
                System.out.println("Subin");
            case "c":
                System.out.println("rahul");
            case "d":
                System.out.println("Kranthi");
                break;
            default:
        }}

         public void Cndtn() {
            int a;
            a=2;
            while(a<=10) {
               System.out.println("condition to loop");
            }
        }

}