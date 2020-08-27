/* 11 - Strategie OneFollowsZeroStrategy
Die Strategie OneFollowsZeroStrategy soll hinter jedem Auftreten des int-Werts 0 in einer Liste ein Element einfügen, das den Wert 1 als Inhalt besitzt. */

public class OneFollowsZeroStrategy extends DoublyLinkedList.InsertionStrategy<Integer>{

public OneFollowsZeroStrategy(){

}

public boolean select(Integer ref){
  return (int)ref == 0;
}

public Integer insert(Integer ref){
  return ref = 1;
}

}