public class Employee {
    
    private String[] names;
    private int[] ages;
    private String[] departments;
    
    public Employee(String[] names, int[] ages, String[] departments) {
        this.names = names;
        this.ages = ages;
        this.departments = departments;
    }
    
    public void displayDetails() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Name: " + names[i] + ", Age: " + ages[i] + ", Department: " + departments[i]);
        }
    }
}
