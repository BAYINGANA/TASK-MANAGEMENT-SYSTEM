package models;

public class HardwareProject extends ProjectCatalog {

    public HardwareProject(int projectID, String projectName, String projectDescription, String projectCategory, String projectStatus, String projectDeadline) {
        super(projectID, projectName, projectDescription, projectCategory, projectStatus, projectDeadline);

    }

    @Override
    public void createProject() {

    }

    @Override
    public void displayAllProjects() {

    }

    @Override
    public void displayProject() {

    }

    @Override
    public void updateProject() {

    }

    @Override
    public void filterProject() {

    }

    @Override
    public void deleteProject() {

    }

    @Override
    public double getCompletionPercentage() {
        return 0;
    }
}
