public class Thesis implements Resource {
    private String title;

    public Thesis(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow() {
        System.out.println("Borrowing Thesis: " + title);
    }
}