package liga.medical.personservice.core.aop;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import liga.medical.commonmodule.core.api.LogService;
import liga.medical.commonmodule.core.dto.DebugDto;
import liga.medical.commonmodule.core.dto.ExceptionDto;
import liga.medical.commonmodule.core.enums.SystemType;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Aspect
@Component
public class LoggerAdvice {
    private final LogService logService;

    public LoggerAdvice(LogService logService) {
        this.logService = logService;
    }

    @Pointcut("@annotation(liga.medical.dto.annotations.DbLog)")
    public void loggableMethods() { }

    @Around("@annotation(liga.medical.dto.annotations.DbLog)")
    public Object serviceLogger(ProceedingJoinPoint pjp) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String id = UUID.randomUUID().toString();
        String methodName = pjp.getSignature().getName();
        String className = pjp.getTarget().getClass().toString();
        Object[] args = pjp.getArgs();
        Object object = null;

        String log = String.format("UUID:%s, метод:%s.%s() с аргументами %s", id, className, methodName, mapper.writeValueAsString(args));
        try {
            object = pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            logService.logException(new ExceptionDto(SystemType.PERSON_SERVICE, throwable.toString()));
        }
        logService.logDebug(new DebugDto(SystemType.PERSON_SERVICE, log));
        return object;
    }
}