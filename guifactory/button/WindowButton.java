package guifactory.button;

public class WindowButton extends Button {

    @Override
    public void onClick() {
        System.out.println("window button is triggered");
    }

    @Override
    public void render() {
        System.out.println("window rendered");
    }

}
