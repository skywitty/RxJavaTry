package RxJava;

import rx.Observable;
import rx.functions.Action1;

/**
 * Created by M-sky on 2017/5/27.
 */
public class HelloRxJava {
    public void hello(String... names) {
        Observable.from(names).subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                System.out.println("Hello " + s + "!");
            }
        });
    }
}
