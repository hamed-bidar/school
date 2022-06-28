package ir.mapsa.school.student;

import ir.mapsa.school.school.School;
import ir.mapsa.school.school.SchoolService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Data
public class StudentService implements IStudentService {


    private final StudentRepository studentRepository;
    private final SchoolService schoolService;

    @Override
    public Student save(Student student) {
        School school = schoolService.getById(student.getSchool().getId());
        student.setSchool(school);
        return studentRepository.save(student);

    }

    @Override
    public Student update(Student student ) {
       //problem
         return studentRepository.save(student);
    }

    @Override
    public Student getById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Long id) {
        getById(id);
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getAll()  {
        return (List<Student>) studentRepository.findAll();
    }
}
