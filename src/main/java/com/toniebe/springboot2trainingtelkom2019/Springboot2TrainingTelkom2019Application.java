package com.toniebe.springboot2trainingtelkom2019;

import com.toniebe.springboot2trainingtelkom2019.di.ClassC;
import com.toniebe.springboot2trainingtelkom2019.di.ClassF;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Springboot2TrainingTelkom2019Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springboot2TrainingTelkom2019Application.class, args);

		ClassF c = context.getBean(ClassF.class);
		System.out.println("nama saya"+ c.getNama());

	}

}
