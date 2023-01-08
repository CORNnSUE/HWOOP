package Lab14.bridge.ex1;

public class PC extends Computer {
    public PC(OperatingSystem os) {
        super(os);
    }

    @Override
    public void startup() {
        this.os.startup();
    }

    @Override
    public void browseInternet(String url) {
        this.os.loadUrl(url);
        System.out.println("PC browsing url " + url);
    }

    @Override
    public boolean canMoveComputer() {
        return false;
    }
}