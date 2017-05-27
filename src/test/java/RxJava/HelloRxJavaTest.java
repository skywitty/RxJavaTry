package RxJava;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by M-sky on 2017/5/27.
 */
public class HelloRxJavaTest {
    private HelloRxJava helloRxJava;
    @Before
    public void initBean(){
        helloRxJava = new HelloRxJava();
    }
    @Test
    public void testHello(){
        helloRxJava.hello(new String[]{"skywitty","mengzj","Frank"});
    }
}
