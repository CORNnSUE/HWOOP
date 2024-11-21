package Lab14.bridge.ex1;

public class App {
    public static void main (String[] args){
        OperatingSystem macOS = new MacOS();
        OperatingSystem windowOS = new WindowOS();

        Computer laptop1 = new Laptop(macOS);
        laptop1.startup();
        laptop1.browseInternet("refactoring.guru");

        Computer pc1 = new PC (windowOS);
        pc1.startup();
        pc1.browseInternet("refactoring.guru");
    }
}
