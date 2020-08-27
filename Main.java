class Main {
    public static void main(String[] args)
    {
        test();
    }
    
    public static void test()
    {
        DoublyLinkedList<Integer> ints = new DoublyLinkedList<Integer>();
        ints.add(6);
        ints.add(5);
        ints.add(6);
        ints.add(7);
        ints.add(8);
        ints.add(6);
        ints.add(-1);
        ints.showAll();
        System.out.println();
        Iterator<Integer> i = ints.iterator();
        
        /*1
        CountXStrategy counter = new CountXStrategy(6);
        ints.inspectAll(counter);
        System.out.println(counter.getCount());
        */
        /*2
        CountIntervalStrategy counter = new CountIntervalStrategy(6,8);
        ints.inspectAll(counter);
        System.out.println(counter.getCount());
        */
        /*3
        AverageOfPositivesStrategy avs = new AverageOfPositivesStrategy();
        ints.inspectAll(avs);
        System.out.println(avs.getAverage());
        */
        /* 4
        AllToAbsStrategy abs = new AllToAbsStrategy();
        ints.substituteAll(abs);
        System.out.println(); */
        /* 5
        AddNToPositivesStrategy aps = new AddNToPositivesStrategy(4);
        ints.substituteAll(aps); */
        
        /* 6
        DoubleAllInIntervalStrategy das = new DoubleAllInIntervalStrategy(0, 3);
        ints.substituteAll(das); */
        /* 7
        RemoveAllNegativesStrategy  rns = new RemoveAllNegativesStrategy();
        ints.deleteSelected(rns); */
        /* 8
        RemoveAllInIntervalStrategy ris = new RemoveAllInIntervalStrategy(5,6);
        ints.deleteSelected(ris); */
        
        /* 10
        RemoveSmallerThanPredecessorStrategy rps = new RemoveSmallerThanPredecessorStrategy();

        ints.deleteSelected(rps); */


        while ( i.hasNext() )
        {
            System.out.print( i.next() + " " );
        }
       
        

        System.out.println();
        DoublyLinkedList<Double> doubles = new DoublyLinkedList<Double>();
        doubles.add( 14.1 ); doubles.add( 7.4 ); doubles.add( 2.3 ); doubles.add( 5.0 );
        Iterator<Double> it = doubles.iterator();
        
        double sum = 0.0;
        while ( it.hasNext() )
        {
            sum += it.next();
        }
        System.out.println( "sum: " + sum );
        
    }

    
}