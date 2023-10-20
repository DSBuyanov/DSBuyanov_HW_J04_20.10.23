
public class Main {
    public static void main(String[] args) {
        TeacherGroup<Teacher> teacherGroup = new TeacherGroup<>();
        teacherGroup.addTeacher(new Teacher("Alina"));
        teacherGroup.addTeacher(new MathTeacher("Denis"));
        teacherGroup.addTeacher(new ScienceTeacher("Roman"));

        teacherGroup.teachAll();
    }
}
