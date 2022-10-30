public class VOIP extends Telecommunication {

    boolean internet;

    public VOIP(String fromNumber, String toNumber, Boolean internet) {
        super(fromNumber, toNumber);
        this.internet = internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    @Override
    public void call() {
        System.out.println("----------VOIP----------");
        if (internet) {
            System.out.println("from " + getFromNumber());
            System.out.println("Calling " + getToNumber());
        } else {
            System.out.println("No internet Connection");
        }

    }

}
