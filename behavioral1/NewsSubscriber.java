import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class NewsSubscriber implements Subscriber<News> {

    @Override
    public void onSubscribe(Subscription subscription) 
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void onNext(News item) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void onError(Throwable throwable) {
        throw new UnsupportedOperationException("Not supported yet."); 
    
    }
    @Override
    public void onComplete() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
   
}
