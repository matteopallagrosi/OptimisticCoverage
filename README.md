# OptimisticCoverage
L’esempio proposto mostra un caso di optimistic coverage in quanto tutto il 
codice risulta testato (coverage 100%), non ci sono failure poiché il metodo 
testNext() verifica solo se il successore del nodo passato in input è quello 
atteso, ma non verifica cosa accade se in input si ha null, situazione in cui si 
genera una NullPointerException non rilevata dai test.
