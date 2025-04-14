public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void borrowResource(Resource resource) {
        System.out.println(name + " is borrowing: " + resource.getTitle());
        resource.borrow();
    }
}