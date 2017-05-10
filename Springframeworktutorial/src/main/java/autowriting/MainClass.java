package autowriting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new FileSystemXmlApplicationContext("beansAutoWiring.xml");
		LoggingClass obj=(LoggingClass)context.getBean("LoggingBeans");
		obj.getmethod1("hi");
		obj.getmethod2("excuse me!");
		
		((FileSystemXmlApplicationContext) context).close();
	}

}
