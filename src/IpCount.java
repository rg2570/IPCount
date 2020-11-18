import sun.util.resources.LocaleData;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;

public interface IpCount {
    public ExtractedIpCount getIpCount() throws IOException;
}
