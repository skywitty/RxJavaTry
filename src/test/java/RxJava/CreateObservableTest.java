package RxJava;

import RxJava.observable.CreateObservable;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rx.Observable;
import rx.functions.Action0;
import rx.functions.Action1;

/**
 * Created by M-sky on 2017/5/27.
 */
public class CreateObservableTest {
    private CreateObservable createObservable;

    private Logger logger = LoggerFactory.getLogger(CreateObservableTest.class);

    @Before
    public void initBean(){
        createObservable = new CreateObservable();
    }

    @Test
    public void testGetObservable(){
        Observable<String> ob = createObservable.getObervable();
    }

    @Test
    public void testSubcribeObervable(){
        createObservable.subcribeObervable(createObservable.getObervable(),logger, false);
    }
}
