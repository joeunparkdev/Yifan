import java.util.*; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
import java.io.*; 

public class App {

    // ---- GLOBAL VARS ----
    // Quantum Time
    private static int QUANTUM_TIME;
    private static ArrayList<User> users = new ArrayList<User>();

    public static void main(String[] args) throws Exception {
        readInputFile("input.txt");
    }

    public static void readInputFile(String fileName) {
        List<String> inputLines = Collections.emptyList();

        // Get Working Directory. Code is one folder lower.
        String workingDirectory = Paths.get("src").toAbsolutePath().toString();

        try {
            inputLines = Files.readAllLines(Paths.get(workingDirectory, fileName), StandardCharsets.UTF_8);
        }

        catch (IOException exception) {
            exception.printStackTrace();
        }

        int inputSize = inputLines.size();
        int lineCounter = 0;

        // Reading Quantum Time
        QUANTUM_TIME = Integer.parseInt(inputLines.get(lineCounter++));
        System.out.print("QUANTUM TIME: " + QUANTUM_TIME + "\n");

        if(inputSize > 1){
            while(lineCounter < inputSize){
                User newUser = new User(inputLines.get(lineCounter++));
                for (int i = 0; i < newUser.getProcessCount(); i++) {
                    newUser.addProcess(new Process(inputLines.get(lineCounter++)));
                }
                users.add(newUser);
                newUser.printUser();
            }
        }
    } 


}
