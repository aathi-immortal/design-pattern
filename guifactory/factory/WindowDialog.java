package guifactory.factory;

import guifactory.button.Button;
import guifactory.button.WindowButton;

public class WindowDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowButton();
    }

}
