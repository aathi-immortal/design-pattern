package guifactory.factory;

import guifactory.button.Button;
import guifactory.button.HtmlButton;

public class HtmlDIalog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }

}
