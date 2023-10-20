
import java.util.ArrayList;
import java.util.List;

public class TeacherGroup<T extends Teacher> {
    private List<T> teachers = new ArrayList<>();

    public void addTeacher(T teacher) {
        teachers.add(teacher);
    }

    public void teachAll() {
        for (T teacher : teachers) {
            teacher.teach();
        }
    }
}
