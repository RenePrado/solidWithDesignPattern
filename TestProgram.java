public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Rene Angelo Prado");

        Resource book = new Book("The Computer Science Book: A Complete Introduction");
        Resource journal = new Journal("IEEE Transactions on Pattern Analysis and Machine Intelligence");
        Resource thesis = new Thesis("AI in Agriculture: Predictive Analytics for Crop and Soil Management");

        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(thesis);
    }
}