package demo.common.model.form;

import demo.common.model.dto.Sample;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class SamplePostForm {

    @NotNull
    private String name;

    @NotNull
    private Number value;

    public Sample toDTO() {
        return new Sample(null, name, value);
    }

}
