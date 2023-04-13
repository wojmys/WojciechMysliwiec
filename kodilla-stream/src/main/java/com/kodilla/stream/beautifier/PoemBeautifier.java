package com.kodilla.stream.beautifier;

public class PoemBeautifier {

   public String beautify(String inscription,PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(inscription);

      return result;
    };

}
