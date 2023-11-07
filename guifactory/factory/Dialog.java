package guifactory.factory;

import guifactory.button.*;

abstract public class Dialog {
    public void windowRendered() {
        Button button = createButton();
        button.onClick();
        button.render();
    }

    abstract public Button createButton();
}
