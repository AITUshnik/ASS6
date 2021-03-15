import factory.Dialog;
import factory.HtmlDialog;
import factory.WindowsDialog;
import singleton.Singleton;
public class main {
    private static Dialog dialog;
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        // There is 2 creation of Singleton.
        //As you can see they are named by different names. But they will work only with 1 Singleton
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        //Because of this to console will be print first Singleton because our Singleton didnt create new Singleton with new value
        //So because of this they are with same value
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);

        System.out.println("********************************************************************");
        System.out.println("There is second code. Factory Method");
        System.out.println("********************************************************************");

        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();


    }



}