package factory;

public class WindowsDialog extends Dialog {
    // And here, as it was said in the abstract class Dialog this method rewrites and performs its function
    // Rewrites createButton() by new WindowsButton();
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
