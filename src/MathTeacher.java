public class MathTeacher extends Teacher {
    public MathTeacher(String name) {
        super(name);
    }

    @Override
    public void teach() {
        System.out.println(getName() + " is teaching Math.");
    }
}
