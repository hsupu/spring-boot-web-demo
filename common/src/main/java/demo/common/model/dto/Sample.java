package demo.common.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "sample")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sample implements Serializable {

    private static final long serialVersionUID = 3786808667166568496L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "value")
    private Number value;

}
