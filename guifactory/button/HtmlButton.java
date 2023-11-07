package guifactory.button;

public class HtmlButton extends Button {

    public void render() {
        System.out.println("html rendered");
    }

    public void onClick() {
        System.out.println("html button is triggered");
    }

}
