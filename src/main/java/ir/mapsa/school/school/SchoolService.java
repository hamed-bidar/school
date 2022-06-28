package ir.mapsa.school.school;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Data
public class SchoolService implements ISchoolService {


    private final SchoolRepository schoolRepository;

    @Override
    public School save(School school) {

        return schoolRepository.save(school);
    }

    @Override
    public School update(School school) {
        //problem
         return null;
    }

    @Override
    public School getById(Long id) {
        return schoolRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Long id) {
        schoolRepository.deleteById(id);
    }

    @Override
    public List<School> getAll()  {
        return (List<School>) schoolRepository.findAll();
    }
}
