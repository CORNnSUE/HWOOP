package Lab14.bridge.ex1;

public class WindowOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("WindowOS starting up");

    }

    @Override
    public void loadUrl(String url) {
        System.out.println("WindowOS loading" + url);

    }
}
