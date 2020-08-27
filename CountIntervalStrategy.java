/* 2 - Strategie CountInIntervalStrategy
Die Strategie CountInIntervalStrategy soll zählen, wie häufig die int-Werte aus einem
(geschlossenen) Intervall [bottom,top] als Inhalte in einer Liste vorkommen.*/


public class CountIntervalStrategy extends DoublyLinkedList.InspectionStrategy<Integer>{
  int count;
  int bot;
  int top;

  public CountIntervalStrategy(int botI, int topI){
    if(botI <= topI){
      count=0;
      bot = botI;
      top = topI;
    } else{
      throw new IllegalArgumentException();
    }
   
  }

  public void inspect(Integer ref){
     if (ref >= bot && ref <= top) {
            count++;
        }
  }

  public int getCount(){
    return count;
  }
} 