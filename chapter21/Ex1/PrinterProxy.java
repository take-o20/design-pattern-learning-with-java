import java.lang.reflect.InvocationTargetException;

public class PrinterProxy implements Printable {
    private String name; // 名前
    private Printable real; // 本人
    private String className;

    // コンストラクタ
    public PrinterProxy(String className) {
        this.name = "No Name";
        this.real = null;
        this.className = className;
    }

    // コンストラクタ（名前指定）
    public PrinterProxy(String name, String className) {
        // リフレクションを使う！
        this.name = name;
        this.real = null;
        this.className = className;
    }

    // 名前の設定
    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    // 名前の取得
    @Override
    public String getPrinterName() {
        return name;
    }

    // 表示
    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    // 「本人」を生成
    private synchronized void realize() {
        if (real == null) {
            try {
                real = (Printable) Class.forName(className).getDeclaredConstructor(String.class)
                        .newInstance(name);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                    | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
                    | SecurityException e) {
                e.printStackTrace();
            }
        }
    }
}
