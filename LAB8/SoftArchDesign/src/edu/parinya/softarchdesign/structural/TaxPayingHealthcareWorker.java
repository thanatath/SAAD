package edu.parinya.softarchdesign.structural;

public class TaxPayingHealthcareWorker  extends HealthcareWorkerDecorator{


    public TaxPayingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        tempWorker = worker;
    }
    @Override
    public double getPrice(){
        return tempWorker.getPrice()*1.1;
    }

}

