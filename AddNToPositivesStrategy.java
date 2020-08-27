/*5 - Strategie AddNToPositivesStrategy
Die Strategie AddNToPositivesStrategy soll in einer Liste alle positiven int-Werte um einen Wert n erhöhen. */

public class AddNToPositivesStrategy extends DoublyLinkedList.SubstitutionStrategy<Integer>{
int n;
  public AddNToPositivesStrategy(Integer n){
    this.n = n;
  }

  public Integer substitute(Integer ref ){
    if(ref >= 0){
    return  ref+n;
    } else{
      return ref;
    }
  }
}