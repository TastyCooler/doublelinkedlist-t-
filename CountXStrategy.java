/* 1 - Strategie CountXStrategy
Die Strategie CountXStrategy soll zählen, wie häufig ein int-Wert x (in einer Liste von Integer-Objekten) vorkommt, der bei der Erzeugung eines Strategie-Objekts angegeben werden soll.
(Hinweis: Diese Strategie wird als Beispiel für eine Lösung bereits mit der Aufgabenstellung bereitgestellt.)*/


public class CountXStrategy extends DoublyLinkedList.InspectionStrategy<Integer>{
  int count;
  int toSearch;

  public CountXStrategy(int x){
    count=0;
    toSearch = x;
  }

  public void inspect(Integer ref){
    if(ref == toSearch){
      count++;
    }
  }

  public int getCount(){
    return count;
  }
} 