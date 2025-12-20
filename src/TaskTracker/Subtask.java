package TaskTracker;

class Subtask extends Task {
    Epic task;
    Subtask(String name, String description,Epic task) {
        super(name, description);
        this.task = task;
    }
}