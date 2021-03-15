package factory;

import factory.Button;
import factory.HtmlButton;

public class HtmlDialog extends Dialog {
    // And here, as it was said in the abstract class Dialog this method rewrites and performs its function
    // Rewrites createButton() by new HtmlButton();
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
