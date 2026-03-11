package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;


public class MainBeans {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("org.example");
        context.refresh();

        PasswordHasher bean = context.getBean(PasswordHasher.class);
        System.out.println(bean);
        System.out.println(bean.hash("hello"));
//        context.close();

        StringBuilder beans1 = context.getBean(StringBuilder.class);
        System.out.println(beans1);

        StringBuilder bean2 = context.getBean(StringBuilder.class);
        System.out.println(bean2);

        Calc bean3 = context.getBean(Calc.class);
        int sum = bean3.add(4,5);
        System.out.println(sum);

        String[] beans = context.getBeanDefinitionNames();

        for(String beanName : beans){
            System.out.println(beanName);
        }

        Object bean4 = context.getBean("calcNamedBean");
        Object bean5 = context.getBean("getCalc");


    // create an object of datasource and inject into the string context

        DataSource ds = context.getBean(DataSource.class);
        System.out.println(ds);

    }
}