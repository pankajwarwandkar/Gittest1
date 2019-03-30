package demo1.driver;
 
import org.testng.ISuite;
import org.testng.ISuiteListener;
 
public class CustomListener3 implements ISuiteListener {
 
    public void onStart(ISuite suite) {
        // When <suite> tag starts
        System.out.println("onStart: before suite starts");
    }
 
    public void onFinish(ISuite suite) {
        // When <suite> tag completes
        System.out.println("onFinish: after suite completes");
    }
}