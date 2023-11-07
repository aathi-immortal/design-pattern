import os.Android;
import os.Os;
import os.Osi;
import os.Window;

public class OsFactory {
    public Os getInstance(String osName) {
        if (osName.equals("open"))
            return new Android();
        else if (osName.equals("closed"))
            return new Osi();
        else
            return new Window();
    }
}
