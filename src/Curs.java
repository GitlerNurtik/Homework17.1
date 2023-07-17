public class Curs {
    private String cours;
    private int number;
    private String TeacherName;
    private Group[] groups;

    public void setCours(String cours) {
        this.cours = cours;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public String getCours() {
        return cours;
    }

    public int getNumber() {
        return number;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public Group[] getGroups() {
        return groups;
    }

    public Curs(String cours, int number, String teacherName, Group[] groups) {
        this.cours = cours;
        this.number = number;
        TeacherName = teacherName;
        this.groups = groups;
    }
}
