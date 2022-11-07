public class Student {
    private int id;
    private String fullname;
    private int age;
    private String group;

    void setId(int id) {
        this.id = id;
    }

    void setFullName(String fullname) {
        this.fullname = fullname;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setGroup(String group1) {
        this.group = group1;
    }

    int getId() {
        return id;
    }

    String getFullname() {
        return fullname;
    }

    int getAge() {
        return age;
    }

    String getGroup() {
        return group;
    }

    void showInfo() {
        System.out.printf("""
                Student:
                Id - %d
                Fullname -%s
                Age - %d
                Group - %s
                """, id, fullname, age, group);
    }
}
