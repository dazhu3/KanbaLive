package com.mmc.entity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
  
@Target(value={ElementType.TYPE,ElementType.FIELD})  //˵��ע����ֵ�λ��
@Retention(value=RetentionPolicy.RUNTIME)
public @interface MyTest {
       String columnName();
}
