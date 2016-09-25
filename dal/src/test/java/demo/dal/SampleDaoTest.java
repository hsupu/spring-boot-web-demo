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
import demo.dal.dao.SampleDao;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DalConfig.class})
@ActiveProfiles({Config.Profile.TEST})
@Transactional
public class SampleDaoTest {

    private static final Log LOG = LogFactory.getLog(SampleDaoTest.class);

    @Autowired
    SampleDao sampleDao;

    @Test
    @Rollback
    public void insertTest() {
        Sample sample1 = new Sample();
        sample1.setName("test");
        sample1.setValue(0);
        Assert.assertEquals(Integer.valueOf(1), sampleDao.insert(sample1));
        Assert.assertNotNull(sample1.getId());
        LOG.info(String.format("insert id: %d", sample1.getId()));

        Sample sample2 = new Sample();
        sample2.setName(null);
        sample2.setValue(0);
        Assert.assertEquals(Integer.valueOf(0), sampleDao.insert(sample2));
    }

}
