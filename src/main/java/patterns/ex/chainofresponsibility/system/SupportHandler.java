package patterns.ex.chainofresponsibility.system;

public abstract class SupportHandler implements RequestHandler {

    protected RequestHandler handler;

    public SupportHandler(RequestHandler handler){
        this.handler=handler;
    }

    @Override
    public abstract boolean handle(Request request);


}
