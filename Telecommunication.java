public abstract class Telecommunication {

    String toNumber;
    String fromNumber;

    public Telecommunication(String fromNumber, String toNumber) {
        this.fromNumber = fromNumber;
        this.toNumber = toNumber;
    }

    public void setFromNumber(String fromNumber) {
        this.fromNumber = fromNumber;
    }

    public void setToNumber(String toNumber) {
        this.toNumber = toNumber;
    }

    public String getFromNumber() {
        return fromNumber;
    }

    public String getToNumber() {
        return toNumber;
    }

    public abstract void call();
}