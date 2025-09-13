package chapter5.ex;

public class TicketMaker {
    private int ticket = 1000;

    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker() {
        System.out.println("インスタンスを生成しました。");
    }

    // synchronizedメソッドが付いてないと、複数のスレッドに対して同じ値を返す危険性がある。
    public synchronized int getNextTicketNumber() {
        return ticket++;
    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }
}
