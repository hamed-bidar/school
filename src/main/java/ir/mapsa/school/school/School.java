package ir.mapsa.school.school;

import ir.mapsa.school.common.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tbl_school")
public class School extends BaseEntity {

    @Column(name = "title")
    private String title;

}
