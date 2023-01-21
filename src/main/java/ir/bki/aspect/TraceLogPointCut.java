package ir.bki.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class TraceLogPointCut {

    @Pointcut("execution(@ir.bki.aspect.annotatin.TraceLog * *(..))")
    public void traceLog() {
    }
}