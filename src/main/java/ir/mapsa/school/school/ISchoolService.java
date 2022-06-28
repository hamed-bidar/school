package ir.mapsa.school.school;

import java.util.List;

public interface ISchoolService {

    School save (School school);
    School update (School school);
    School getById(Long id);
    void  delete(Long id);
    List <School> getAll();


}
