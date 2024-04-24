package patterns.ex.chainofresponsibility.system;

public class Support {

    private SupportHandler handler;

    public Support(){
        handler =
                new HardwareSupportHandler(
                        new SoftwareSupportHandler(
                                new NetworkSupportHandler(null)));

    }

    public void handleRequest(Request request){
        boolean handled = handler.handle(request);
        if (!handled)
            System.out.println("Request not handled");
    }

}
