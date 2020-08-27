/*  3 - Strategie AverageOfPositivesStrategy
Die Strategie AverageOfPositivesStrategy soll den Mittelwert aller positiven int-Werte einer Liste als doubleWert bestimmen. (Hinweis: Kommt ein positiver Wert mehrfach in der Liste vor, so soll er auch mehrfach in die Durchschnittsberechnung eingehen.)*/

public class AverageOfPositivesStrategy extends DoublyLinkedList.InspectionStrategy<Integer>{
  int sum;
  int size;
  public AverageOfPositivesStrategy(){
  }

  public void inspect(Integer ref){
    if(ref >= 0){

    sum += ref;
    size++;
    }

    
  }

  public double getAverage(){
    return (double)sum/(double)size;
  }

  public int getSum(){
    return sum;
  }
} 
