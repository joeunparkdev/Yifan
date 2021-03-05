public class Process {
    // ---- CONSTRUCTOR ----
    public Process(String inputLine){
        String[] splitInput = inputLine.split(" ");
        readyTime = Integer.parseInt(splitInput[0]);
        serviceTime = Integer.parseInt(splitInput[1]);
        remainingTime = serviceTime;        
    }

    // ---- ACCESSORS ----
    public int getReadyTime() {
        return readyTime;
    }
    public int getServiceTime() {
        return serviceTime;
    }
    public int getRemainingTime() {
        return remainingTime;
    }
    public int getProcessId() {
        return processId;
    }
    public ProcessStatus getStatus() {
        return status;
    }

    // ---- SETTERS ----
    public void setReadyTime(int newReadyTime) {
        readyTime = newReadyTime;
    }
    public void setServiceTime(int newServiceTime) {
        serviceTime = newServiceTime;
    }
    public void setRemainingTime(int newRemainingTime) {
        remainingTime = newRemainingTime;
    }
    public void setProcessId(int newProcessId) {
        processId = newProcessId;
    }
    public void setStatus(ProcessStatus newStatus) {
        status = newStatus;
    }

    
    // ---- ATTRIBUTES ----
    private int readyTime = -1;
    private int serviceTime = -1;
    private int remainingTime = -1;
    private int processId = -1;
    private ProcessStatus status = ProcessStatus.Unknown;
}
