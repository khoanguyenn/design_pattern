package iterator_pattern;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
	
    public static void main(String[] args) {
       NameRepository<String> namesRepository = new NameRepository<String>();
       namesRepository.add(Arrays.asList("Robert" , "John" ,"Julie" , "Lora", "Bill", "Alex"));
       //namesRepository.add(Arrays.asList(123, 124, 213, 1523));
       for(Iterator iter = namesRepository.getR2LIterator(); iter.hasNext();){
          System.out.println("Name : " + iter.next());
       } 
     
    }
 }
 