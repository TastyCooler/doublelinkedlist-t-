/* 9 - Strategie RemoveAndCountAllInIntervalStrategy
Die Strategie RemoveAndCountAllInIntervalStrategy soll alle Elemente mit einem int-Wert aus einem (geschlossenen) Intervall [bottom,top] aus einer Liste löschen. Zusätzlich soll die Strategie zählen, wie viele Elemente gelöscht
worden sind. */

public class RemoveAndCountAllInIntervalStrategy extends DoublyLinkedList.DeletionStrategy<Integer>{

int bot;
int top;
int count;

public RemoveAndCountAllInIntervalStrategy(int bot, int top){
this.bot = bot;
this.top = top;
count = 0;
}

public boolean select(Integer ref){
  if(ref >= bot && ref <= top){
    count++;
    return true;
  } else{
    return false;
  }
}

public int getCount(){
  return count;
}

}