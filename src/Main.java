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
// Step 3: Service consumer class
public class DataProcessor {
    private DataService dataService;

    // Constructor injection of the DataService
    public DataProcessor(DataService dataService) {
        this.dataService = dataService;
    }

    public void process() {
        // Delegate the task to the injected service
        String result = dataService.performTask();
        System.out.println("Processed result: " + result);
    }
}
