import java.util.Scanner;

public class MobilePhone extends Telephone {

    private String modelName;
    String messageText;

    public MobilePhone(String from, String to, String name) {
        super(from, to);
        this.modelName = name;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    @Override
    public void call() {
        System.out.println("----------Mobile Phone----------");
        System.out.println(getModelName());
        System.out.println("from " + getFromNumber());
        System.out.println("Calling " + getToNumber());
    }

    public void message() {
        try (Scanner msg = new Scanner(System.in)) {
            messageText = msg.nextLine();
        }

        System.out.println(getModelName());
        System.out.println("from " + getFromNumber());
        System.out.println("To " + getToNumber());
    }

}
