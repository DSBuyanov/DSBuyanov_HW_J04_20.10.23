public class ScienceTeacher extends Teacher {
    public ScienceTeacher(String name) {
        super(name);
    }

    @Override
    public void teach() {
        System.out.println(getName() + " is teaching Science.");
    }
}
