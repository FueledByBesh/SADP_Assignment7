package patterns.ex.chainofresponsibility.system;

public class SoftwareSupportHandler extends SupportHandler{

    public SoftwareSupportHandler(RequestHandler handler) {
        super(handler);
    }

    @Override
    public boolean handle(Request request) {
        if(request.getType().equalsIgnoreCase("Software")) {
            System.out.println("Handling software request " + request.getID() + "\n" + "Request Description: " + request.getDescription() + "\n");
            return true;
        }
        if(this.handler!=null)
            return this.handler.handle(request);
        return false;
    }
}
