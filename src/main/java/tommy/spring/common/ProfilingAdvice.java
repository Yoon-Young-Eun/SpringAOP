package tommy.spring.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class ProfilingAdvice { //공통기능을 제공할 클래스

	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{
		                              //getSignatur() 메서드 설명반환, toString() 메서드 설명 출력?
		String signatureString = joinPoint.getSignature().toString();
		System.out.println(signatureString +" 시작");
		long start = System.currentTimeMillis();
		try {
			Object result = joinPoint.proceed();
			return result;
		}finally {
			long finish = System.currentTimeMillis();
			System.out.println(signatureString + " 종료");
			System.out.println(signatureString + " 실행시간 : "+(finish-start)+"ms");
		}
	}
}
