package patterns.ex.chainofresponsibility.system;

public class HardwareSupportHandler extends SupportHandler{

    public HardwareSupportHandler(RequestHandler handler) {
        super(handler);
    }

    @Override
    public boolean handle(Request request) {
        if(request.getType().equalsIgnoreCase("Hardware")) {
            System.out.println("Handling hardware request " + request.getID() + "\n" + "Request Description: " + request.getDescription() + "\n");
            return true;
        }
        if(this.handler!=null)
            return this.handler.handle(request);
        return false;
    }

}
