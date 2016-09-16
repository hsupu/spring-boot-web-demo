package demo.dal.dao.mapper;

import demo.common.model.dto.Sample;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SampleMapper {

    int insert(Sample sample);

    Sample select(int id);

    int selectCount();

}
