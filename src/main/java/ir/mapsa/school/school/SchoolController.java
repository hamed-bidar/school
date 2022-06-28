package ir.mapsa.school.school;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Data
@RequestMapping("/school")
public class SchoolController {
    private final SchoolMapper mapper;
    private final ISchoolService service;

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success|OK"),
            @ApiResponse(responseCode = "201", description = "create"),
            @ApiResponse(responseCode = "409", description = "not found"),})

    @PutMapping("/v1/save")
    public ResponseEntity<Void> save(@RequestBody SchoolDTO schoolDTO) {
        School school = mapper.toSchool(schoolDTO);
        service.save(school);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/v1/getById/{id}")
    public ResponseEntity<SchoolDTO> getById(@PathVariable Long id) {
        School school = service.getById(id);
        SchoolDTO schoolDTO = mapper.toSchoolDTO(school);
        return ResponseEntity.ok(schoolDTO);

    }

    @GetMapping("/v1/getAll")
    public ResponseEntity<List<SchoolDTO>> getAll() {
        List<School> schools = service.getAll();
        List<SchoolDTO> schoolDTOS = mapper.toSchoolDTOs(schools);
        return ResponseEntity.ok(schoolDTOS);
    }

    @PostMapping("/v1/update")
    public School update(@RequestBody School school, @PathVariable Long id) {
         return service.update(school);


    }

    @DeleteMapping("/v1/deleteById/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);

    }
}
