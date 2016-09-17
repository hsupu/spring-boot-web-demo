package demo.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import demo.common.model.dto.Sample;
import demo.dal.dao.mapper.SampleMapper;

@Repository
public class SampleDAO {

    @Autowired
    SampleMapper mapper;

    public int insert(Sample sample) {
        return mapper.insert(sample);
    }
    public Sample select(int id) {
        return mapper.select(id);
    }

    public int selectCount() {
        return mapper.selectCount();
    }


}
