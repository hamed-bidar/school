package ir.mapsa.school.student;

import ir.mapsa.school.common.BaseEntity;
import ir.mapsa.school.school.School;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tbl_school")
public class Student extends BaseEntity {

    @Column (name = "name")
    private String name;

    @Column (name = "family")
    private String family;

    @Column (name = "age")
    private Integer age;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

}
