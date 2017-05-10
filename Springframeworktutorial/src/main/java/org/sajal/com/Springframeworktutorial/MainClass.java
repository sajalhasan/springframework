package org.sajal.com.Springframeworktutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("BeansFile.xml");
		ClassA obj=(ClassA)context.getBean("ClassABeans");
		
		for(String n:obj.getName())
		{
			System.out.println(n.toString());
		}
		
		((FileSystemXmlApplicationContext) context).close();
		
	}

}
