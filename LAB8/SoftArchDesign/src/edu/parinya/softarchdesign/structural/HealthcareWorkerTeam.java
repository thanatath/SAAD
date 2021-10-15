package edu.parinya.softarchdesign.structural;
import java.util.ArrayList;

public class HealthcareWorkerTeam implements HealthcareServiceable {
    ArrayList<HealthcareWorker> members = new ArrayList<>();

    public void addMember(HealthcareWorker member){

        members.add(member);//add member to objWorker

    }

    public void removeMember(HealthcareWorker member){

        members.remove(member);//remove member to objWorker

    }
    public void service(){
        for (int i=0; i<members.size(); i++) { // loop for literal service output
            members.get(i).service();
        }

    }
    public double getPrice(){
        double priceTemp=0;
        for (int i=0; i<members.size(); i++) {
            priceTemp+=members.get(i).getPrice();
        }
        return  priceTemp;
    }
}

