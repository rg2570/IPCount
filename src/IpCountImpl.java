import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

public class IpCountImpl {
    HashMap <String, HashMap<String, Integer>> finalResul= new HashMap<String, HashMap<String, Integer>>();
    public HashMap<String, HashMap<String, Integer>> getIpCountPerDay(File rawData) throws IOException {
        List<String> rawDataLines = Files.readAllLines(Paths.get("rawData"));
        for (String line: rawDataLines)
              {
            String timeStamp = line.split(" ")[1];
            if (timeStamp not )
        }


        return HashMap< String, HashMap<String, Integer>>;
        }
    }

