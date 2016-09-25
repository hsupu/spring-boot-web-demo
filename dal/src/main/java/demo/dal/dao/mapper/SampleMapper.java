package demo.dal.dao.mapper;

import demo.common.model.dto.Sample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface SampleMapper {

    Integer insert(Sample sample);

    Sample select(int id);

    @Options(useCache = false, flushCache = Options.FlushCachePolicy.TRUE)
    Sample selectUncached(int id);

    Integer selectCount();

}
