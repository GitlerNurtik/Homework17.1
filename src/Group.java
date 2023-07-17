public class Group {
    public Student[] getStudents() {
        return students;
    }

    public String getGoal() {
        return goal;
    }

    public String getStartedDate() {
        return StartedDate;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public void setStartedDate(String startedDate) {
        StartedDate = startedDate;
    }

    public Group(Student[] students, String goal, String startedDate) {
        this.students = students;
        this.goal = goal;
        StartedDate = startedDate;
    }

    private Student[] students;
    private String goal;
    private String StartedDate;

}
