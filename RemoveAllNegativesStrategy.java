/*7 - Strategie RemoveAllNegativesStrategy
Die Strategie RemoveAllNegativesStrategy soll alle Elemente mit negativen int-Werten aus einer Liste löschen. */

public class RemoveAllNegativesStrategy extends DoublyLinkedList.DeletionStrategy<Integer>{


public RemoveAllNegativesStrategy(){

}

public boolean select(Integer ref){
  if(ref < 0){
    return true;
  } else{
    return false;
  }
}

}