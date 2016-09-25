package demo.common.model.vm;

import demo.common.model.dto.Sample;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SampleVM {

    private String name;

    private Number value;

    public static SampleVM from(Sample entity) {
        SampleVM bean = new SampleVM();
        bean.setName(entity.getName());
        bean.setValue(entity.getValue());
        return bean;
    }

}
