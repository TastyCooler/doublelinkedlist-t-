/* 13 - Strategie SubtotalOfThreeElementsStrategy
Die Strategie SubtotalOfThreeElementsStrategy soll hinter jedem dritten Element einer Liste ein neues Element
einfügen, das die Zwischensumme der drei vorangehenden int-Werte als Inhalt enthält. Möglicherweise verbleiben am
Ende der Liste Elemente, deren Inhalte nicht in die Berechnung einer Zwischensumme eingehen. */

public class SubtotalOfThreeElementsStrategy extends DoublyLinkedList.InsertionStrategy<Integer>{
int subtotal = 0;
int counter = 0;

public boolean select(Integer ref){
 counter++;
 subtotal += ref;
 return counter % 3 == 0;
}

public Integer insert(Integer ref){
  int temp = subtotal;
  subtotal = 0;
  return temp;
}


}