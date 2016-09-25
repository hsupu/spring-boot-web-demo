package demo.dal.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import demo.common.model.dto.Sample;
import demo.dal.dao.SampleDao;
import demo.dal.dao.mapper.SampleMapper;
import demo.dal.util.DaoUtils;

@Repository
@Transactional
public class SampleDaoImpl implements SampleDao {

    @Autowired
    SampleMapper sampleMapper;

    public Integer insert(Sample sample) {
        return DaoUtils.convertNullPointerToZero(sampleMapper.insert(sample));
    }

    public Sample select(int id) {
        return sampleMapper.select(id);
    }

    public Integer selectCount() {
        return DaoUtils.convertNullPointerToZero(sampleMapper.selectCount());
    }

}
