/*6 - Strategie DoubleAllInIntervalStrategy
Die Strategie DoubleAllInIntervalStrategy soll in einer Liste alle int-Werte aus einem
(geschlossenen) Intervall [bottom,top] verdoppeln.*/

public class DoubleAllInIntervalStrategy extends DoublyLinkedList.SubstitutionStrategy<Integer>{

int bot;
int top;

public DoubleAllInIntervalStrategy(int bot, int top){
  this.bot = bot;
  this.top = top;
}

public Integer substitute(Integer ref){
  if(ref >= bot && ref <= top){
    return ref * 2;
  } else{
    return ref;
  }
}


}