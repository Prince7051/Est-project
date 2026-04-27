import java.io.Serializable;

public class StudentSimple implements Serializable {
    
    private Long id;
    private String name;
    private String email;
    private String course;
    
    // Default constructor
    public StudentSimple() {}
    
    // Parameterized constructor
    public StudentSimple(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getCourse() {
        return course;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
    
    // Main method to test
    public static void main(String[] args) {
        StudentSimple student = new StudentSimple("John Doe", "john@example.com", "Computer Science");
        student.setId(1L);
        
        System.out.println("Student created:");
        System.out.println(student);
        
        // Test getters
        System.out.println("\nStudent Details:");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Course: " + student.getCourse());
    }
}
