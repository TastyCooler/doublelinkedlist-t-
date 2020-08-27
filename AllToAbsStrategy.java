/* 4 - Strategie AllToAbsStrategy
Die Strategie AllToAbsStrategy soll in einer Liste alle int-Werte auf ihren Absolutbetrag setzen.  */

public class AllToAbsStrategy extends DoublyLinkedList.SubstitutionStrategy<Integer>{


public Integer substitute(Integer ref){
 return Math.abs(ref);
}


}