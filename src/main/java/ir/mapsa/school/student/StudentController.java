package ir.mapsa.school.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Data
@RequestMapping("/Student")
public class StudentController {
    private final StudentMapper mapper;
    private final IStudentService service;

    @PutMapping("/v1/save")
    public ResponseEntity<Void> save(@RequestBody StudentDTO studentDTO) {
        Student student = mapper.toStudent(studentDTO);
        service.save(student);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/v1/getById/{id}")
    public ResponseEntity<StudentDTO> getById(@PathVariable Long id) {
        Student student = service.getById(id);
        StudentDTO studentDTO = mapper.toStudentDTO(student);
        return ResponseEntity.ok(studentDTO);

    }

    @GetMapping("/v1/getAll")
    public ResponseEntity<List<StudentDTO>> getAll() {
        List<Student> students = service.getAll();
        List<StudentDTO> studentDTOS = mapper.toStudentDTOs(students);
        return ResponseEntity.ok(studentDTOS);
    }

    @PostMapping("/v1/update")
    public Student update(@RequestBody Student student, @PathVariable Long id) {
         return service.update(student);

    }

    @DeleteMapping("/v1/deleteById/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
