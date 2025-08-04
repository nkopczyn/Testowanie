package pl.coderslab.cykl_zycia;

public class Task {
    public int id;
    public String title;
    public String description;
    public String status;

    public Task(int id, String title, String description, String status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void changeStatus(String status) {
        this.status = status;
    }

    public void completeTask() {
        this.status = "completed";
    }
}
