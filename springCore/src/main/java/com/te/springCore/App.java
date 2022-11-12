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
//        System.out.println(bean);                 //using class name
        
//        App bean = clx.getBean(App.class);
//        System.out.println(bean);              no bean data present so, (NoSuchBeanDefinitionException)
    
        User bean = (User)clx.getBean("bean1");
        System.out.println(bean);                    // using bean name
        
        User bean2 = clx.getBean("bean2",User.class);
        System.out.println(bean2);
        bean2.setAge(24);                          // updating the age of user
        System.out.println(bean2);
        
    }
}
