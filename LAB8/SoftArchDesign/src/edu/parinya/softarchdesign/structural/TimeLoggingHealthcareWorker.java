package edu.parinya.softarchdesign.structural;
import java.util.Date;
public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator {

    public TimeLoggingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        tempWorker = worker;
    }

    @Override
    public void service() {
        System.out.print(new Date()+": ");
        tempWorker.service();
    }

}


