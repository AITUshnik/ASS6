import builder.builders.CarBuilder;
import builder.builders.CarManualBuilder;
import builder.cars.Car;
import builder.cars.Manual;
import builder.director.Director;
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
        //Its a Factory method part
        //Two methods which shows our Factory method
        configure();
        runBusinessLogic();
        System.out.println("********************************************************************");
        System.out.println("There is third code. Home Method");
        System.out.println("********************************************************************");
        Director director = new Director();

        // Director gets the concrete builder object from the client.
        // That's because application knows better which builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object
        // since Director is not aware and not dependent on concrete builders and products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }


///     The concrete factory is usually chosen depending on configuration or environment options.

    static void configure() {
        //There only if your PC with OS "Windows 10" Java will show windows tab.
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
            //Else text on console
        } else {
            dialog = new HtmlDialog();
        }
    }


///      All of the client code should work with factories and products through abstract interfaces.
///      This way it does not care which factory it works with and what kind of product it returns.

    static void runBusinessLogic() {
        dialog.renderWindow();
    }



}