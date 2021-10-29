
class main {
    public static void main(String args[]) {

        //still debug not final bro !!!!
        String input = "test123456!@(*#&^";
        new StringPublisher(input).subscribe(new AlphabetSubscriber());
        new StringPublisher(input).subscribe(new NumberSubsriber());
        new StringPublisher(input).subscribe(new SymbolSubscriber());
        //still debug not final bro !!!!
    }
}