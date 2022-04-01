public abstract class HealthcareWorkerDecorator extends HealthcareWorker{

    private HealthcareWorker worker = null;

    public HealthcareWorkerDecorator(HealthcareWorker wrapWorker){
        super(wrapWorker.getName(),wrapWorker.getPrice());
        worker = wrapWorker;

    }
    public void service(){
        worker.service();
    }
    public float getPrice(){
       return worker.getPrice();
    }
}