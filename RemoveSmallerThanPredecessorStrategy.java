/* 10 - Strategie RemoveSmallerThanPredecessorStrategy
Die Strategie RemoveSmallerThanPredecessorStrategy soll alle Elemente aus einer Liste löschen, deren int-Wert
– in der Ausgangsliste – kleiner als der int-Wert des Vorgängerelements ist. Das erste
Element einer Liste hat keinen Vorgänger und bleibt daher immer erhalten. */

public class RemoveSmallerThanPredecessorStrategy extends DoublyLinkedList.DeletionStrategy<Integer>{

int pred;
boolean isFirst;

public RemoveSmallerThanPredecessorStrategy(){
pred = 0;
isFirst = true;
}

public boolean select(Integer ref){
if(isFirst){

  isFirst = false;
  pred = (int)ref;
  return false;


  } else{
    boolean result = pred > (int)ref;
    pred = (int)ref;
    return result;
  }

 
  


}


}