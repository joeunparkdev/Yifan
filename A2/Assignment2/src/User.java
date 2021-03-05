import java.util.ArrayList;

public class User {
    // ---- CONSTRUCTOR ----
    public User(String inputLine){
        String[] splitInput = inputLine.split(" ");
        identifier = splitInput[0];
        processCount = Integer.parseInt(splitInput[1]);        
    }

    // ---- ACCESSORS ----
    public String getIdentifier() {
        return identifier;
    }
    public Process[] getServiceTime() {
        return (Process[]) processes.toArray();
    }
    public int getProcessCount() {
        return processCount;
    }

    // ---- SETTERS ----
    public void setReadyTime(String newIdentifier) {
        identifier = newIdentifier;
    }
    public void setProcesses(Process[] newProcessArray) {
        processes.clear();
        processCount = 0;
        for (Process process : newProcessArray) {
            processes.add(process);
            processCount++;
        }
    }
    public void addProcess(Process newProcess) {
        processes.add(newProcess);
    }

    public void printUser() {
        System.out.print("USER " + this.identifier + ":\n");
        System.out.print("\tProcess - Count (" + this.processCount + "):\n");
        for (int i = 0; i < this.processCount; i++) {
            System.out.print("\t\tProcess - " + (i+1) + ":\n");
            System.out.print("\t\t\tStatus: " + this.processes.get(i).getStatus() + "\n");
            System.out.print("\t\t\tReady Time: " + this.processes.get(i).getReadyTime() + "\n");
            System.out.print("\t\t\tService Time: " + this.processes.get(i).getServiceTime() + "\n");
            System.out.print("\t\t\tRemaining Time: " + this.processes.get(i).getRemainingTime() + "\n");
        }
    }

    
    // ---- ATTRIBUTES ----
    private String identifier = "Unknown";
    private ArrayList<Process> processes = new ArrayList<Process>();
    private int processCount = -1;
}
