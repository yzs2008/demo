package com.example.spring.learn.demo;

import com.example.spring.learn.demo.model.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoApplication {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Student student = (Student) factory.getBean("kaidi");
        student.displayInfo();
        student.testReplaceMethod();
    }
}
