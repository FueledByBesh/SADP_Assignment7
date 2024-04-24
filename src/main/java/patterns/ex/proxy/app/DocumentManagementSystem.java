package patterns.ex.proxy.app;

import patterns.ex.proxy.system.*;

public class DocumentManagementSystem {
    public static void main(String[] args) {

        User user1 = new User("f134r","Olzhas");
        User user2 = new User("42grd","Nurbol");

        Document document1 = new Document("ghue23","document1");
        Document document2 = new Document("hgu3wg","document2");
        Document document3 = new Document("ghiu3w","document3");

        DocumentStorageProxy documentStorageProxy = new DocumentStorageProxy();
        documentStorageProxy.getPermission(user1);

        documentStorageProxy.uploadDocument(user1,document1);

        // uploading doc for user that hasn't permission
        documentStorageProxy.uploadDocument(user2,document2);


        Document document = documentStorageProxy.downloadDocument(user1,"ghue23");

        System.out.println(document==document1);
    }
}
