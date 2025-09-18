package chapter19.ex4;

// 問題点
// * 非常時という状態に入ったら、永久に非常時のままであること ⭕️
public class AlertState implements State {
    private static AlertState singleton = new AlertState();

    private AlertState() {}

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {

    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("非常ベル(非常時)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("非常ベル(非常時)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("非常事態の通話(非常時)");
    }

    @Override
    public String toString() {
        return "[非常時]";
    }
}
