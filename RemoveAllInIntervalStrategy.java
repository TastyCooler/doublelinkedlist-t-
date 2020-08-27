/* 8 - Strategie RemoveAllInIntervalStrategy
Die Strategie RemoveAllInIntervalStrategy soll alle Elemente mit einem int-Wert aus einem (geschlossenen)
Intervall [bottom,top] aus einer Liste löschen. */

public class RemoveAllInIntervalStrategy 
extends DoublyLinkedList.DeletionStrategy<Integer>{

int bot;
int top;

public RemoveAllInIntervalStrategy(int bot, int top){
this.bot = bot;
this.top = top;
}

public boolean select(Integer ref){

   return ref >= bot && ref <= top;
}

}