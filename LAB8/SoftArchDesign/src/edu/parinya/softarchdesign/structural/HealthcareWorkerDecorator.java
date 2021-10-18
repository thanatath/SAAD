package edu.parinya.softarchdesign.structural;

public class HealthcareWorkerDecorator extends HealthcareWorker{
protected HealthcareWorker tempWorker;

    public HealthcareWorkerDecorator(HealthcareWorker worker) {
        super(worker);
this.tempWorker = worker;
System.out.println("Decorate "+ this.tempWorker.getName() +" with TimeLogging.");
    }


    public void service() {
        tempWorker.service();
    }
    public double getPrice(){
        return tempWorker.getPrice();
    }



}
