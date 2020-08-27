/* 12 - Strategie SubtotalStrategy
Die Strategie SubtotalStrategy soll hinter jedem Element einer Liste ein Element einfügen, das die Zwischensumme
aller vorangehenden int-Werte als Inhalt enthält. */

public class SubtotalStrategy extends DoublyLinkedList.InsertionStrategy<Integer>{

int subtotal = 0;

public boolean select(Integer ref){
  return true;
}

public Integer insert(Integer ref){
  return subtotal += ref;
}


}