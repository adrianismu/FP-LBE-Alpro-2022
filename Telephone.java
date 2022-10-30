public class Telephone extends Telecommunication {

    public Telephone(String from, String to) {
        super(from, to);
    }

    @Override
    public void call() {
        System.out.println("----------Telephone----------");
        System.out.println("from " + getFromNumber());
        System.out.println("Calling " + getToNumber());

    }
}