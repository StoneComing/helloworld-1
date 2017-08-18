package com.service.jaxrs.csedemo;

import com.service.jaxrs.csedemo.model.Person;

import java.io.InputStream;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

public class CsedemoAgent {

    public Integer add(Integer a,Integer b){

        // Do Some Magic Here!
        //return null;
    	Integer c;
    	c = a + b;
    	return c;
    };


    public String sayHei(String name){

        // Do Some Magic Here!
        //return null;
    	return  name +" say hei";
    };


    public String sayHello(String name){

        // Do Some Magic Here!
        //return null;
    	return name + " say hello";
    };


    public String sayHi(String name){

        // Do Some Magic Here!
        //return null;
    	return name + " say hi";
    };


    public String saySomething(String prefix,Person user){

        // Do Some Magic Here!
        //return null;
    	return prefix + " say something";
    };

}
