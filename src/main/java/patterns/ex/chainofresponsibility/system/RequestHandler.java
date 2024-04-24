package patterns.ex.chainofresponsibility.system;

public interface RequestHandler {
    boolean handle(Request request);
}
