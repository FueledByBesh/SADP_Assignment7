package patterns.ex.chainofresponsibility.system;

public class Request {

    private int ID;
    private String type;
    private String description;

    public Request(int ID, String type, String description) {
        this.ID = ID;
        this.type = type;
        this.description = description;
    }

    public int getID() {
        return ID;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
