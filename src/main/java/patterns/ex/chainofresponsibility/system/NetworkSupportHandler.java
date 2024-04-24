package patterns.ex.chainofresponsibility.system;

public class NetworkSupportHandler extends SupportHandler{

    public NetworkSupportHandler(RequestHandler handler) {
        super(handler);
    }

    @Override
    public boolean handle(Request request) {
        if(request.getType().equalsIgnoreCase("Network")) {
            System.out.println("Handling network request " + request.getID() + "\n" + "Request Description: " + request.getDescription() + "\n");
            return true;
        }
        if(this.handler!=null)
            return this.handler.handle(request);
        return false;
    }
}
