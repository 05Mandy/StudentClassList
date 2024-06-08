package za.ac.tut.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-06-08T16:40:33")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, byte[]> image;
    public static volatile SingularAttribute<Student, Character> gender;
    public static volatile SingularAttribute<Student, String> surname;
    public static volatile ListAttribute<Student, String> subjects;
    public static volatile SingularAttribute<Student, String> name;
    public static volatile SingularAttribute<Student, Long> id;
    public static volatile SingularAttribute<Student, Date> time;
    public static volatile SingularAttribute<Student, Integer> age;

}