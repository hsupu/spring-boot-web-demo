package demo.dal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import demo.common.Config;
import demo.common.model.dto.Sample;
import demo.dal.config.MyBatisConfig;
import demo.dal.dao.mapper.SampleMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MyBatisConfig.class})
@ActiveProfiles({Config.Profile.TEST})
@Transactional
public class SampleMapperTest {

    private static final Log LOG = LogFactory.getLog(SampleMapperTest.class);

    @Autowired
    SampleMapper sampleMapper;

}
