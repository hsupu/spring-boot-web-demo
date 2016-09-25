package demo.dal.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SampleAspect {

    private static final Log LOG = LogFactory.getLog(SampleAspect.class);

//    @Pointcut("execution(* demo.dal.dao.mapper.SampleMapper.*(..))")
//    public void pointcut1() {}
//
//    @Before(value = "pointcut1()")
//    public void before(JoinPoint joinPoint) {
//        String className = joinPoint.getTarget().getClass().getCanonicalName();
//        String actionName = joinPoint.getSignature().getName();
//        int argc = joinPoint.getArgs().length;
//        LOG.info(String.format("access(with %d args) at %s::%s", argc, className, actionName));
//    }
//
//    @AfterReturning(value = "pointcut1()", returning = "returnValue")
//    public void after(JoinPoint joinPoint, Object returnValue) {
//        String className = joinPoint.getTarget().getClass().getCanonicalName();
//        String actionName = joinPoint.getSignature().getName();
//        String returnString = returnValue == null ? "" : returnValue.toString();
//        LOG.info(String.format("returning [%s] at %s::%s", returnString, className, actionName));
//    }
//
//    @AfterThrowing(value = "pointcut1()", throwing = "throwable")
//    public void throwing(JoinPoint joinPoint, Throwable throwable) {
//        String className = joinPoint.getTarget().getClass().getCanonicalName();
//        String actionName = joinPoint.getSignature().getName();
//        String exception = throwable.getClass().getName();
//        String message = throwable.getMessage();
//        LOG.info(String.format("throwing %s(%s) at %s::%s", exception, message, className, actionName));
//    }
//
//    @Around("pointcut1()")
//    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
//        return joinPoint.proceed();
//    }

}
