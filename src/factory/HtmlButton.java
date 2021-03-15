package factory;

public class HtmlButton implements Button {
    //There define of 2 method which was written in Button interface
    //Html render show it on console
    public void render() {
        //In console will be written <button>Test Button</button>
        System.out.println("<button>Test Button</button>");
        onClick();
    }
    //Then on clicking it will out "Click! Button says - 'Hello World!'"
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}