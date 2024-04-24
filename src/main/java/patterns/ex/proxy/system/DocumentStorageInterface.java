package patterns.ex.proxy.system;

public interface DocumentStorageInterface {

    void uploadDocument(User user,Document document);
    Document downloadDocument(User user,String documentId);
    void editDocument(User user,String documentId,String newContent);
    Document searchDocument(User user,String query);

}
