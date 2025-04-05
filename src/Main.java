// Define the interface
public interface DataService {
    String performTask();
}
// Step 2: Implement two concrete service classes

public class ApiDataService implements DataService {
    private String apiKey;

    // Constructor to inject dependencies (e.g., API key)
    public ApiDataService(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public String performTask() {
        return "Data fetched from API using key: " + apiKey;
    }
}

public class FileDataService implements DataService {
    private String filePath;

    // Constructor to inject dependencies (e.g., file path)
    public FileDataService(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String performTask() {
        return "Data read from file located at: " + filePath;
    }
}
