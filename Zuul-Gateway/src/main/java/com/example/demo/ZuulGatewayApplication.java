package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.ribbon.RibbonClient;
//import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;

//import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;

//import Filtres.AuthorizationHeaderFilter;
import Filtres.ErrorFilter;
import Filtres.PostFilter;
import Filtres.PreFilter;
import Filtres.RouteFilter;
import Filtres.AuthorizationHeaderFilter;

//@EnableAuthorizationServer
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication

//@RibbonClient(name = "Job-service", configuration = RibbonConfiguration.class)
public class ZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayApplication.class, args);
	}
	
	
	//@Bean
	//public AuthorizationHeaderFilter AuthorizationHeaderFilter(OAuth2AuthorizedClientService clientService) {
	//	return new AuthorizationHeaderFilter(clientService) ;
		
	//}
	
	@Bean //avant l envoi de req
	public PreFilter preFilter() {
	    return new PreFilter();
	}
	@Bean //apres la req
	public PostFilter postFilter() {
	    return new PostFilter();
	}
	@Bean //aficher des msg d erreur
	public ErrorFilter errorFilter() {
	    return new ErrorFilter();
	}
	@Bean  //en cours se l envoi de req
	public RouteFilter routeFilter() {
	    return new RouteFilter();
	}
		
}
