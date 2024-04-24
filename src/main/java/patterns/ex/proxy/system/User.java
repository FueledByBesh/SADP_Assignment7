package patterns.ex.proxy.system;

public class User {

    private String Id;
    private String name;

    public String getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public User(String id, String name) {
        Id = id;
        this.name = name;
    }
}
