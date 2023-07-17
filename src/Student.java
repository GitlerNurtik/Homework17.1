public class Student {
    private int age;
    private String name;
    private String surname;
    private String Email;

    public Student(int age1, String name, String surname, String email) {
        age = age1;
        this.name = name;
        this.surname = surname;
        Email = email;
        if (age1 <= 0){
            System.out.println("Ваш возраст не может быть отрицательным числом");
        }
    }

    public int getBirthday() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return Email;
    }

    public void setBirthday(int age1) {
        age = age1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
