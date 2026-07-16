import java.util.*;

abstract class CourseType {
    protected String name;

    public CourseType(String name){
        this.name=name;
    }

    public abstract void display();
}

class ExamCourse extends CourseType{
    public ExamCourse(String name){
        super(name);
    }

    public void display(){
        System.out.println("Exam Course : "+name);
    }
}

class AssignmentCourse extends CourseType{
    public AssignmentCourse(String name){
        super(name);
    }

    public void display(){
        System.out.println("Assignment Course : "+name);
    }
}

class ResearchCourse extends CourseType{
    public ResearchCourse(String name){
        super(name);
    }

    public void display(){
        System.out.println("Research Course : "+name);
    }
}

class Course<T extends CourseType>{
    private List<T> courses=new ArrayList<>();

    public void addCourse(T c){
        courses.add(c);
    }

    public List<T> getCourses(){
        return courses;
    }
}

public class UniversityDemo{
    public static void display(List<? extends CourseType> list){

        for(CourseType c:list)
            c.display();
    }

    public static void main(String[] args){
        Course<ExamCourse> exam=new Course<>();
        exam.addCourse(new ExamCourse("Java"));

        Course<AssignmentCourse> assign=new Course<>();
        assign.addCourse(new AssignmentCourse("Python"));

        Course<ResearchCourse> research=new Course<>();
        research.addCourse(new ResearchCourse("Artificial Intelligence"));

        display(exam.getCourses());
        display(assign.getCourses());
        display(research.getCourses());
    }
}