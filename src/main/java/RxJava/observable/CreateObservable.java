package RxJava.observable;

import org.slf4j.Logger;
import rx.Observable;
import rx.functions.Action0;
import rx.functions.Action1;

/**
 * Created by M-sky on 2017/5/27.
 */
public class CreateObservable {
    public Observable getObervable(){
        Observable<String> ob = Observable.from(new String[]{"skywitty","mengzj","Frank"});
        return ob;
    }

    public void subcribeObervable(Observable ob, Logger logger, boolean error){
        Action1<String> onNext = new Action1<String>() {
            @Override
            public void call(String s) {
                logger.info("observable says : " + s);
                if(error && s.equals("skywitty")){// unknowable exception
                    int a = 1/0;
                }
            }
        };
        Action1<Throwable> onError = new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {
                logger.error("Error : " + throwable.getMessage());
            }
        };
        Action0 onCompleted = new Action0() {
            @Override
            public void call() {
                logger.info("Game over, good night my dear!");
            }
        };
        logger.info("begin");
        ob.subscribe(onNext, onError, onCompleted);
        logger.info("stop");
    }
}
