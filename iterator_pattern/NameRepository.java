package iterator_pattern;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class NameRepository<T> implements Container<T> {
   public List<T> listOfThings = new ArrayList<T>();

   public void add(T name) {
      listOfThings.add(name);
   }

   public void add(List<T> names) {
      this.listOfThings = names;
   }

   @Override
   public Iterator<T> getL2RIterator() {
      return new L2RIterator();
   }

   @Override
   public Iterator<T> getR2LIterator() {
      return new R2LIterator();
   }

   @Override 
   public Iterator<T> getAlphabetIterator() {
      return new AlphabetIterator();      
   }

   private class L2RIterator implements Iterator<T> {
      int index;
      @Override
      public boolean hasNext() {
      
         if(index < listOfThings.size()){
            return true;
         }
         return false;
      }

      @Override
      public T next() {
      
         if(this.hasNext()){
            return listOfThings.get(index++);
         }
         return null;
      }		
   }
   private class R2LIterator implements Iterator<T> {
      int index = listOfThings.size() - 1;
      @Override
      public boolean hasNext() {
      
         if(index >= 0){
            return true;
         }
         return false;
      }

      @Override
      public T next() {
      
         if(this.hasNext()){
            return listOfThings.get(index--);
         }
         return null;
      }		
   }
   private class AlphabetIterator implements Iterator<T> {
      List<String> alphabetNames = new ArrayList<String>();
      int index;

      public AlphabetIterator() {
         alphabetNames = ((List<String>) listOfThings).stream().sorted().collect(Collectors.toList());
      }

      @Override
      public boolean hasNext() {
      
         if(index < listOfThings.size()){
            return true;
         }
         return false;
      }

      @Override
      public T next() {
         if(this.hasNext()){
            return (T) alphabetNames.get(index++);
         }
         return null;
      }		
   }
}