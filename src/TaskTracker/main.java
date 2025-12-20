package TaskTracker;


public class main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        Task task = new Task("Сделать уроки", " - математика и русский язык");
        taskManager.createTask(task);
        System.out.println(task.getId());

        Task task2 = new Task("Помыть полы"," - нужно найти ведро");
        taskManager.createTask(task2);
        System.out.println(task2.getId());

        Epic epic = new Epic("Переезд в новую квартиру", "");
        taskManager.createEpic(epic);
        System.out.println(epic.getId());

        Subtask subtask = new Subtask("Собрать вещи","описание", epic);
        taskManager.createSubtask(subtask);
      System.out.println(subtask.getId());

//        System.out.println(epic.getSubstacks().size());
        taskManager.printAllTasks();
    }
}