//Its a Singleton package. I named it like this for easy navigation, in fact its unnecessary.
package singleton;
    //Class name also like package name unnecessary.
public final class Singleton {
    //To implement Singleton method you must declare it as private static field.
        // This private static field will store our singleton instance. As example:
        private static Singleton instance;
        // This line for writing value to our private Singleton because fields with private access modifier cant be seen outside the classroom itself
        public String value;

        private Singleton(String value) {
            // The following code emulates slow initialization.
            try {
                //So there is emulating of the slow initialization. It will initialize 1000 milli seconds.
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                // Its the catch part of try-catch. So if we have problem with this part of code we can find it easier by error .
                ex.printStackTrace();
            }
            // There out method implement current "value" by value that we wrote.
            this.value = value;
        }
        // Here is Singleton method to get Singleton itself
        public static Singleton getInstance(String value) {
            //Here it checks is a Singleton already created, if not then the condition if will work
            if (instance == null) {
                instance = new Singleton(value);
            }
            // And if it does, the same Singleton that was created earlier returns.
            return instance;
        }
    }

