package ir.mapsa.school.school;

import io.swagger.annotations.ApiModelProperty;
import ir.mapsa.school.common.BaseDTO;
import lombok.Data;

@Data
public class SchoolDTO extends BaseDTO {

    @ApiModelProperty(required = true, hidden = false)
    private String title;
}
