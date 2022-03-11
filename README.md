# JAVA_CONCORRENZA
La concorrenza è quando più "Attori" vogliono utilizzare la stessa risorsa nello stesso momento. Nel nostro caso gli attori sono i nostri Thread e la risorsa è la stessa porzione di memoria dov'è memorizzato un dato. Cosa succede se due thread vogliono incrementare il valore della risorsa nello stesso momento, il thread1 di 7 ed il Thread2 di 2, in partenza la risorsa vale 5:
<li>Thread1: 5 + 7 --> 12</li>
<li>Thread2: 5 + 2 --> 7</li>
Che valore avrà la risorsa condivisa ? Se non utilizziamo un sistema opportuno per gestire la concorrenza il valore finale sarà 12 o 7 in base a chi termina per ultimo. Se gestiamo la concorrenza il valore finale sarà 14 !</br>
Per sincronizzare i thread e quindi bloccare una risorse finche un thread non finisce di usarla si utilizza la parola riservata synchronized sui metodi richiesti.</br>
Negli esempio riportati si può vedere la differenza nel valore della variabile dopo che termina l'ultimo thread.
