package chapter15.ex2.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {}

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("chapter15/maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title(username + "'s web page");
            writer.paragraph("Welcome to " + username + "'s web page!");
            writer.paragraph("Nice to meet you!");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeLinkPage(String filename) {
        try {
            Properties mailprop = Database.getProperties("chapter15/maildata");
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Link page");
            for (Enumeration<Object> e = mailprop.keys(); e.hasMoreElements();) {
                String mail = (String) e.nextElement();
                String user = mailprop.getProperty(mail);
                writer.mailto(mail, user);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
