public class Process {
    private int arrivalTime;
    private String name;
    private int executionTime;

    public Process(int arrivalTime, String name, int executionTime) {
        this.arrivalTime = arrivalTime;
        this.name = name;
        this.executionTime = executionTime;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public String getName() {
        return name;
    }

    public int getExecutionTime() {
        return executionTime;
    }

    @Override
    public String toString() {
        return "arrivalTime=" + arrivalTime +
                ", name='" + name + '\'' +
                ", executionTime=" + executionTime;
    }
}
