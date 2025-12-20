package TaskTracker;
import java.util.ArrayList;




public class TaskManager {

    ArrayList<Task> tasks = new ArrayList<>();
    ArrayList<Subtask> subtasks = new ArrayList<>();
    ArrayList<Epic> epics = new ArrayList<>();
    ArrayList <String> allTasks = new ArrayList<>();


    void deleteAllTasks() {
        tasks.clear();
        subtasks.clear();
        epics.clear();
    }

    public ArrayList<String> getSubtasks() {
        ArrayList <String> namesOfSubtasks = new ArrayList<>();
        for(Task task : subtasks) {
            namesOfSubtasks.add(task.getName());
        } return namesOfSubtasks;
    }
    public ArrayList<String> getEpics() {
        ArrayList <String> namesOfEpics = new ArrayList<>();
        for(Task task : epics) {
            namesOfEpics.add(task.getName());
        } return namesOfEpics;
    }
    public ArrayList<String> getTasks() {
        ArrayList <String> names = new ArrayList<>();
        for(Task task : tasks) {
            names.add(task.getName());
        } return names;
    }



    void printAllTasks() {
        System.out.println("Все задачи уровня Tasks:");
        for (int i = 0; i < getTasks().size(); i++) {
            System.out.println(getTasks().get(i));
        }
        System.out.println("Все задачи уровня Subtasks:");
        for (int i = 0; i < getSubtasks().size(); i++) {
            System.out.println(getSubtasks().get(i));
        }
        System.out.println("Все задачи уровня Epic:");
        for (int i= 0; i < getEpics().size(); i++) {
            System.out.println(getEpics().get(i));
        }
    }

    private int id1 = 1;

    void createTask(Task task) {
        tasks.add(task);
        id1++;

    }

    void createEpic(Epic epic) {
        epics.add(epic);
        id1++;

    }

    void createSubtask(Subtask subtask) {
        subtasks.add(subtask);
        id1++;

    }
}
