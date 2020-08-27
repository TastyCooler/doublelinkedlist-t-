/* 14 - Strategie InsertFromListStrategy
Die Strategie InsertFromListStrategy soll hinter jedem Element einer Liste ein Element einfügen. Die Inhalte der
eingefügten Elemente sollen nacheinander einer zweiten Liste entnommen werden, die bei der Erzeugung eines StrategieObjekts angegeben werden soll. Enthält diese zweite Liste nicht genügend viele Einträge, so soll die Ausführung der
insert-Methode mit einer Ausnahme abbrechen. */

public class InsertFromListStrategy extends DoublyLinkedList.InsertionStrategy<Integer>{

DoublyLinkedList<Integer> list;

public InsertFromListStrategy(DoublyLinkedList<Integer> list){
this.list = list;
}

public boolean select(Integer ref){
  return true;
}

public Element insert(Element ref){
  if(!list.isEmpty()){

    Integer newContent = list.getFirst();
    list.removeFirst();
    return newContent;

  } else{
    throw new RuntimeException();
  }
}

}