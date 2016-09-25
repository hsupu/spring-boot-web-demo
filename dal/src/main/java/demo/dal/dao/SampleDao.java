package demo.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import demo.common.model.dto.Sample;
import demo.dal.dao.mapper.SampleMapper;

@Repository
@Transactional
public interface SampleDao {

    Integer insert(Sample sample);

    Sample select(int id);

    Integer selectCount();

}
