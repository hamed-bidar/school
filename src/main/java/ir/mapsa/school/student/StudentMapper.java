package ir.mapsa.school.student;

import ir.mapsa.school.school.SchoolMapper;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",uses = {SchoolMapper.class})
public interface StudentMapper {
    Student toStudent(StudentDTO StudentDTO);
    StudentDTO toStudentDTO(Student Student);

    List<Student> toStudents (List<StudentDTO>StudentDTOS);
    List<StudentDTO> toStudentDTOs(List<Student> Students);
}
