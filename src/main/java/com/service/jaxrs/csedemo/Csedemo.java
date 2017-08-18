package com.service.jaxrs.csedemo;

import com.service.jaxrs.csedemo.model.Person;

import java.util.List;
import java.io.InputStream;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

public interface Csedemo {

    Integer add(Integer a,Integer b);


    String sayHei(String name);


    String sayHello(String name);


    String sayHi(String name);


    String saySomething(String prefix,Person user);

}