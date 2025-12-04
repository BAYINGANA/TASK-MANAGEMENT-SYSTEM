package models;

public class TaskCatalog {

    private final int taskId;
    private String taskName;
    private String taskDescription;
    private TaskStatus taskStatus;
    private int assignedUserId;
    private final int projectID;

    public TaskCatalog(int taskId, String taskName, String taskDescription, int projectID) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskStatus = TaskStatus.NOT_STARTED;
        this.assignedUserId = 0;
        this.projectID = projectID;
    }

    public int getTaskId() {
        return taskId;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public int getAssignedUserId() {
        return assignedUserId;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setAssignedUserId(int assignedUserId) {
        this.assignedUserId = assignedUserId;
    }
    public int getProjectID(){
        return projectID;
    }

    @Override
    public String toString() {
        return "Task{id=" + taskId + ", name='" + taskName + "', status=" + taskStatus +
                ", assignedUserId=" + assignedUserId + ", projectId=" + projectID + "}";
    }
}

