package patterns.ex.chainofresponsibility.app;

import patterns.ex.chainofresponsibility.system.*;

public class HelpDeskTicketingSystem {
    public static void main(String[] args) {

        Support support = new Support();

        Request request1 = new Request(1,"Hardware","Laptop screen is blank.");
        Request request2 = new Request(2,"Network","Cannot connect to the internet.");
        Request request3 = new Request(3,"Software","Email application syncing issues.");
        Request request4 = new Request(4, "Undefined","Word processor crashes.");

        support.handleRequest(request1);
        support.handleRequest(request2);
        support.handleRequest(request3);
        support.handleRequest(request4);

    }
}
