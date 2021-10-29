import java.util.concurrent.Flow;

class main {
    public static void main(String args[]) {

        //line 7-10 it's debug only!!!!
/*        String input = "test123456!@(*#&^";
        new StringPublisher(input).subscribe(new AlphabetSubscriber());
        new StringPublisher(input).subscribe(new NumberSubsriber());
        new StringPublisher(input).subscribe(new SymbolSubscriber());*/



        String input = "test123456!@(*#&^";
        StringPublisher mainPublisher = new StringPublisher(input);

        mainPublisher.subscribe(new AlphabetSubscriber());
        mainPublisher.subscribe(new NumberSubsriber());
        mainPublisher.subscribe(new SymbolSubscriber());

    }
}