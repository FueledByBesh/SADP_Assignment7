package patterns.ex.proxy.system;

public class Document {

    private String Id;
    private String content;

    public Document(String id, String content) {
        Id = id;
        this.content = content;
    }

    public String getId() {
        return Id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
