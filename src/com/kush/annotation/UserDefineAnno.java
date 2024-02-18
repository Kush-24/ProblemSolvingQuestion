package com.kush.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Marker Annotation
// Single value annotation
// Multiple value annotation

//how we create annotation:

// Meta Annotation:
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

@interface SmartPhones{
	String os() default "ios";
	int version() default 2;
	
}

// how we use annotation.
@SmartPhones(os="android",version=9)
class NokiaSeries{
	String model;
	int size;
	public NokiaSeries(String model, int size) {
		super();
		this.model = model;
		this.size = size;
	}	
}

public class UserDefineAnno {
		public static void main(String[] args) {
			NokiaSeries n=new NokiaSeries("7 Pro", 7);
			Annotation an=n.getClass().getAnnotation(SmartPhones.class);
			SmartPhones s=(SmartPhones) an;
			
			System.out.println(s.os()+"  "+s.version());
		}
}
