package RxJava.observable;

import rx.Observable;
import rx.Observer;

/**
 * Created by M-sky on 2017/5/27.
 */
public class ObserverTry {

    public void observableSubscribeObserver(Observable observable, Observer observer){
        observable.subscribe(observer);
    }

}
