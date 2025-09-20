package drawer;

import java.awt.Color;
import command.Command;

public class ColorCommand implements Command {
    // 描画対象
    protected Drawable drawable;
    Color color = Color.BLUE;

    public ColorCommand(Drawable d, Color targetColor) {
        drawable = d;
        color = targetColor;
    }

    // 実行
    @Override
    public void execute() {
        drawable.setColor(color);
    }
}
