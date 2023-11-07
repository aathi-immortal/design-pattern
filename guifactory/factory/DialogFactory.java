package guifactory.factory;

import java.util.Scanner;

public class DialogFactory {
    public Dialog getInstance(String type) {

        if (type.equals("window"))
            return new WindowDialog();
        else if (type.equals("html"))
            return new HtmlDIalog();
        else
            return null;
    }

}
