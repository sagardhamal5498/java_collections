package PrajwalPrograms.STREAM_CHEATSHEET;

public class Project {

    private String projectCode;
    private String name ;
    private String client;
    private String buLeadName;

    public Project( String projectCode, String name, String client, String buLeadName) {
        this.buLeadName = buLeadName;
        this.client = client;
        this.name = name;
        this.projectCode = projectCode;
    }

    public String getBuLeadName() {
        return buLeadName;
    }

    public String getClient() {
        return client;
    }

    public String getName() {
        return name;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setBuLeadName(String buLeadName) {
        this.buLeadName = buLeadName;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    @Override
    public String toString() {
        return "Project{" +
                "buLeadName='" + buLeadName + '\'' +
                ", projectCode='" + projectCode + '\'' +
                ", name='" + name + '\'' +
                ", client='" + client + '\'' +
                '}';
    }
}
