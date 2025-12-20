package TaskTracker;

class Task {
    private String name;
    private int id;
    private String description;
    private String status;

     Task (String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}
