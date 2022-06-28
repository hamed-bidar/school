package ir.mapsa.school.school;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SchoolMapper {
    School toSchool(SchoolDTO schoolDTO);
    SchoolDTO toSchoolDTO(School school);

    List<School> toSchools (List<SchoolDTO>schoolDTOS);
    List<SchoolDTO> toSchoolDTOs(List<School> schools);
}
