import java.util.*;

abstract class JobRole{
    protected String role;

    public JobRole(String role){
        this.role=role;
    }

    public abstract void display();
}

class SoftwareEngineer extends JobRole{
    public SoftwareEngineer(){
        super("Software Engineer");
    }

    public void display(){
        System.out.println(role);
    }
}

class DataScientist extends JobRole{
    public DataScientist(){
        super("Data Scientist");
    }

    public void display(){
        System.out.println(role);
    }
}

class ProductManager extends JobRole{
    public ProductManager(){
        super("Product Manager");
    }

    public void display(){
        System.out.println(role);
    }
}

class Resume<T extends JobRole>{
    private String candidate;
    private T role;

    public Resume(String candidate,T role){
        this.candidate=candidate;
        this.role=role;
    }

    public T getRole(){
        return role;
    }

    public void display(){
        System.out.println(candidate+" applied for "+role.role);
    }
}

public class ResumeScreening{
    public static <T extends JobRole> void processResume(Resume<T> resume){
        resume.display();
    }

    public static void screeningPipeline(List<? extends JobRole> roles){
        System.out.println("\nScreening Pipeline");

        for(JobRole role:roles)
            role.display();
    }

    public static void main(String[] args){
        Resume<SoftwareEngineer> r1= new Resume<>("Harsh Sharma",new SoftwareEngineer());
        Resume<DataScientist> r2= new Resume<>("Kush Gupta",new DataScientist());
        Resume<ProductManager> r3= new Resume<>("Prakhar Patel",new ProductManager());

        processResume(r1);
        processResume(r2);
        processResume(r3);

        List<JobRole> roles=new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        screeningPipeline(roles);
    }
}