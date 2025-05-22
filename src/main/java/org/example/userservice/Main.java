package org.example.userservice;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;

import java.net.URI;

public class Main {
  public static final String BASE_URI = "http://localhost:8080/api/";

  public static HttpServer startserver(){
      final ResourceConfig config = new ResourceConfig().packages("org.example.userservice");
      return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), config);
  }

  public static void main(String[] args){
      final HttpServer server = startserver();
      System.out.println("User service running at "+ BASE_URI);
      System.out.println("Press enter to stop the server...");

      try{
          Thread.currentThread().join();
      }catch(Exception e){
          e.printStackTrace();
      }
      server.shutdownNow();
  }
}