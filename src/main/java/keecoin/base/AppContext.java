package keecoin.base;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AppContext implements ApplicationContextAware {
	
	private static ApplicationContext applicationContext;

	public static <T> T getBean(String name){
		return (T) applicationContext.getBean(name);
	}
	
	public static <T> T getBean(Class<T> type){
		return applicationContext.getBean(type);
	}

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.applicationContext = context;
	}

}
