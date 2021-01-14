package com.youys;

import com.youys.config.AppConfig;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.Wrapper;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;



/**
 * @Author: youys
 * @Date: 2020/7/21
 * @Description:
 */
public class BootRun {

	public static void run(){

		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8082);


		System.out.println("fsdf");
		Context context = tomcat.addWebapp("/api", "");



//		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
//		ac.register(AppConfig.class);
//		ac.refresh();
//
//		DispatcherServlet servlet = new DispatcherServlet(ac);
//
//		Wrapper app = Tomcat.addServlet(context, "app", servlet);
//		app.setLoadOnStartup(1);
//
//		context.addServletMappingDecoded("/*","app");



		try {
			tomcat.start();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
//		tomcat.getServer().await();

	}
}
