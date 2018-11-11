package jy.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.http.HttpStatus;

@Configuration
@ImportResource(locations = {"classpath:/conf/application-yard.xml"})
public class BaseConfig {

    public ConfigurableWebServerFactory ConfigurableWebServerFactory(){
        TomcatServletWebServerFactory TomcatServletWebServerFactory = new TomcatServletWebServerFactory();
        ErrorPage error400Page = new ErrorPage(HttpStatus.BAD_REQUEST, "/errorPage/400.html");//客户端请求的语法错误，服务器无法理解
        ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/errorPage/404.html");//服务器无法根据客户端的请求找到资源（网页）
        ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/errorPage/500.html");//服务器内部错误，无法完成请求
        TomcatServletWebServerFactory.addErrorPages(error400Page,error404Page,error500Page);
        return TomcatServletWebServerFactory;
    }
}
