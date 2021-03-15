package factory;

public abstract class Dialog {

    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

     //Subclasses will override this method in order to create specific buttonobjects.
    //In our example this method override by Html, Windows dialoge
    public abstract Button createButton();
}
