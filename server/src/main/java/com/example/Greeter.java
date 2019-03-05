package com.example;


public class Greeter {

  
  public Greeter() {

  }
  
  /**
  * @param someone is name of a good personne
  * @return afficher something right
  */

  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
