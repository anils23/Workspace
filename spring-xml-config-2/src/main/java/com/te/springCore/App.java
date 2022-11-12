package com.te.springCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// spring dependency injection using property/setters
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        ClassPathXmlApplicationContext clx = new ClassPathXmlApplicationContext("springxml.xml");
//        User bean = clx.getBean(User.class);
//        System.out.println(bean);
        
        User bean = (User)clx.getBean("bean1");
        System.out.println(bean);
        
        User bean2 = (User)clx.getBean("bean2");
        System.out.println(bean2);
        
//        App bean = clx.getBean(App.class);
//        System.out.println(bean);              no bean data present so, NoSuchBeanDefinitionException
    }
}
