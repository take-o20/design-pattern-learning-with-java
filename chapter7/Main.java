package chapter7;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main plain|html");
            System.exit(0);
        }
        if (args[0].equals("text")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getTextResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String filename = htmlBuilder.getHTMLResult();
            System.out.println("HTMLファイル" + filename + "が作成されました。");
        } else if (args[0].equals("md")) {
            MDBuilder mdBuilder = new MDBuilder();
            Director director = new Director(mdBuilder);
            director.construct();
            String filename = mdBuilder.getMDResult();
            System.out.println("Markdownファイル" + filename + "が作成されました。");
        } else {
            usage();
            System.exit(0);
        }
    }

    public static void usage() {
        System.out.println("Usage: java Main text");
        System.out.println("Usage: java Main html");
    }
}
