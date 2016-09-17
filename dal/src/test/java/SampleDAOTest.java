import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import demo.common.model.dto.Sample;
import demo.dal.DalConfig;
import demo.common.config.ProfileConfig;
import demo.dal.dao.SampleDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DalConfig.class})
@ActiveProfiles(ProfileConfig.DEBUG)
@Transactional
public class SampleDAOTest {

    @Autowired
    SampleDAO dao;

    @Test
    @Rollback
    public void insertTest() {
        Sample sample = new Sample();
        sample.setName("test");
        sample.setValue(0);
        int ret = dao.insert(sample);
        Assert.assertTrue(ret == 1);
        Assert.assertTrue(sample.getId() != 0L);
    }

}
