package demo.dal.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

/**
 * @author xp
 */
@Component
@Aspect
public class MapperAspect {

    private static final Log LOG = LogFactory.getLog(MapperAspect.class);

    @Pointcut("execution(* demo.dal.dao.mapper.*Mapper.*(..))")
    public void pointcut1() {}

    @Around("pointcut1()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            return joinPoint.proceed();
        } catch (DataAccessException ex) {
            LOG.warn(ex.getMessage());
            return null;
        }
    }

}
