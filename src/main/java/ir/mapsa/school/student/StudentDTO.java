package ir.mapsa.school.student;

import io.swagger.annotations.ApiModelProperty;
import ir.mapsa.school.common.BaseDTO;
import ir.mapsa.school.school.SchoolDTO;
import lombok.Data;

@Data

public class StudentDTO extends BaseDTO {

    @ApiModelProperty(required = true, hidden = false)
    private String name;
    @ApiModelProperty(required = true, hidden = false)
    private String family;
    @ApiModelProperty(required = true, hidden = false)
    private Integer age;

    @ApiModelProperty(required = true, hidden = false)
    private SchoolDTO school;
}
