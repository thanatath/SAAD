import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.concurrent.*;

class StringPublisher extends StringSubScription implements Flow.Publisher<String> {
    private final String messageString;
    ArrayList<Flow.Subscriber> subList = new ArrayList<>();
    StringPublisher(String textValue) {
        this.messageString = textValue;
        System.out.println("Publish Text contain : "+textValue);

    }

    boolean keepNumOnly(String input){

        return  !((input.replaceAll("[^0123456789]+", "")).isEmpty());

    }

    boolean keepAlOnly(String input){

        return  !((input.replaceAll("[^a-zA-Z]+", "")).isEmpty());

    }

    boolean keepSymOnly(String input){

        return  !((input.replaceAll("[a-zA-Z]|[0123456789]", "")).isEmpty());

    }


    @Override
    public void subscribe(Flow.Subscriber<? super String> subscriber) {
            this.subList.add(subscriber);
            subscriber.onSubscribe(new StringSubScription());
    }

    public void publisherAction(String input){
try {
    for (Flow.Subscriber subList : subList) { //loop sub
        if((subList.getClass().getSimpleName()=="AlphabetSubscriber") && keepAlOnly(input)){
            subList.onNext(input);

        }
        if((subList.getClass().getSimpleName()=="NumberSubsriber") && keepNumOnly(input)){
            subList.onNext(input);

        }
        if((subList.getClass().getSimpleName()=="SymbolSubscriber") && keepSymOnly(input)){
            subList.onNext(input);

        }
    }
} catch (Exception e){
    System.out.println("Something WenWrong ???? ::: "+e);
}finally {
    System.out.println("!!!!Publisher Finished!!!!");
}

    }


    public void showSubList() { //show sub array for debug
        System.out.println(this.subList.toString());
    }
}