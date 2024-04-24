package patterns.ex.proxy.system;

import java.util.HashSet;
import java.util.Set;

public class DocumentStorageProxy implements DocumentStorageInterface{

    private DocumentStorageInterface docStorage;
    private Set<User> hasPermission;

    public DocumentStorageProxy() {
        this.docStorage = new RealDocumentStorage();
        this.hasPermission = new HashSet<>();
    }

    public void getPermission(User user){
        this.hasPermission.add(user);
        System.out.println("User "+user.getName()+" got permission");
    }

    private boolean authenticateUser(User user){
        return hasPermission.contains(user);
    }

    private void logAction(User user,String action){
        System.out.println("Action logged: "+action+" by user "+user.getName());
    }

    @Override
    public void uploadDocument(User user, Document document) {
        if(authenticateUser(user)){
            logAction(user,"upload");
            this.docStorage.uploadDocument(user,document);
        }else
            System.out.println("Authentication failed for upload.");
    }

    @Override
    public Document downloadDocument(User user, String documentId) {

        if(authenticateUser(user)){
            logAction(user,"download");
            return this.docStorage.downloadDocument(user,documentId);
        }

        System.out.println("Authentication failed for download.");
        return null;
    }

    @Override
    public void editDocument(User user, String documentId, String newContent) {

        if(authenticateUser(user)){
            logAction(user,"edit");
            this.docStorage.editDocument(user,documentId,newContent);
        }
        else
            System.out.println("Authentication failed for edit.");
    }

    @Override
    public Document searchDocument(User user, String query) {

        if(authenticateUser(user)){
            logAction(user,"search");
            return this.docStorage.searchDocument(user,query);
        }
        System.out.println("Authentication failed for search");
        return null;
    }
}
