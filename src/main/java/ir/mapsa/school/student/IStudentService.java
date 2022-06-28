package ir.mapsa.school.student;

import java.util.List;

public interface IStudentService {

    Student save (Student student);
    Student update(Student student);
    Student getById(Long id);
    void delete(Long id);
    List<Student> getAll();


}
