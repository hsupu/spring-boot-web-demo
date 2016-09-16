package demo.common.model.result;

import demo.common.model.dto.Sample;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SampleBean {

    private String name;

    private Number value;

    public static SampleBean from(Sample entity) {
        SampleBean bean = new SampleBean();
        bean.setName(entity.getName());
        bean.setValue(entity.getValue());
        return bean;
    }

}
