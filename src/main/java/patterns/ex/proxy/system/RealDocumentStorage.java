package patterns.ex.proxy.system;

import java.util.*;

public class RealDocumentStorage implements DocumentStorageInterface{

    Map<User, Set<Document>> docStorage = new HashMap<>();

    @Override
    public void uploadDocument(User user, Document document) {
        if(!docStorage.containsKey(user))
            this.docStorage.put(user,new HashSet<>());
        this.docStorage.get(user).add(document);
        System.out.println("Document uploaded by user "+user.getName());
    }

    @Override
    public Document downloadDocument(User user, String documentId) {

        Document doc = findDoc(user,documentId);
        System.out.println((doc==null)?"Document "+documentId+" not found!":"Document "+documentId+" downloaded by user "+user.getName());
        return doc;

    }

    @Override
    public void editDocument(User user, String documentId, String newContent) {

        Document doc = findDoc(user,documentId);

        if(doc==null)
            return;

        doc.setContent(newContent);
        System.out.println("Document "+documentId+" edited by user "+user.getName());

    }

    @Override
    public Document searchDocument(User user, String query) {
        return null;
    }

    private Document findDoc(User user, String id){

        if(!docStorage.containsKey(user))
            return null;

        List<Document> documents = docStorage.get(user).stream().toList();

        for(Document document: documents){
            if(document.getId().equals(id))
                return document;
        }

        return null;
    }

}
