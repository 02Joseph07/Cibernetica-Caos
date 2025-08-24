# Solución Taller: Explorando Sistemas Dinámicos y Bifurcaciones


## Teórico

2- Diferencia entre:

• Sistemas discretos y continuos: Los sistemas continuos tienen entradas y salidas continuas y sus variables cambian de forma pasiva con el tiempo como las ecuaciones diferenciales, mientras que los sistemas discretos cambian con variables/pasos definidos.

• Estabilidad y caos: Ambos siguen reglas deterministas pero la diferencia radica en la predictibilidad, en un sistema estable el comportamiento a futuro de este se puede predecir mientras que cuando hay caos no se puede predecir.

3- Ejemplo real: El tráfico en una rotonda sin semáforos.

4-

5- 	Xn representa el crec imiento de la población u otra variable en n tiempo entre 0 	y 1

	r representa la tasa de crecimiento

(1-Xn) representa los resursos limitados de X,

6- Si r aumenta mucho el sistema pasa de estar estable a oscilar y finalmente caos

## Análisis Matemático

Sustituimos en X = 0 y X = 1- (1/r)

	Es estable si r < 1
	
 	Es estable si 1 < r < 3

3- El punto fijo estable representa el equilibrio al que tiene la población u otra variable si no hay perturbaciones grandes. Tambien cuando este punto es inestable el sistema deja de tener equilibrio y se vuelve caotico.

Programacion y Exploracion:

• ¿Qué pasa con Xn si r=2.5? • ¿Qué pasa con r=3?2? • ¿Qué ocurre con r=3?8?

En 2.5 r empieza a osiclar entre 0.6, con 3.2 empieza a oscilar entre 0.5 y 0.8 y en 3.8 ya es caos total, en cada iteracion da valores totalmente diferentes y no se ve un patrón

## Diagrama de Bifurcaciones

1 - ¿Dónde aparecen los puntos de bifurcación?: La primera aparece aproximadamente cuando r = 3

2- ¿En qué intervalos aparece el caos?: Aparece cuando r se aproxima a 3.5

3- ¿Qué significado real puede tener esto?: Al aumentar la tasa de crecimiento r, el sistema que parecia ordenado se vuelve impredecible, esto pasa por ejemplo en la economia donde pasa de ser estable a tener fluctuaciones por pequeños parametros

## Análisis Crítico

1 - ¿Por qué sistemas deterministas pueden generar caos?: Por que aunque la regla es fija, tiene una alta sensibilidad ante las condiciones iniciales, generando pequeñas diferencias que crecen con el tiempo volviendose impredecibles.

2 - ¿Qué diferencias encuentras entre orden, caos y homeostasis?:

Orden: Comportamiento estable y predecible

Caos: Comportamiento irregular y sensible, sin patrones aparentes haciendolo 	impredecible

Homeostasis: Es la capacidad de un sistema de autorregularse u adaptarse para 	mantenerse estable ante perturbaciones

3 - La cantidad de stickers que alguien manda en un grupo de WhatsApp

Orden: con pocos stickers (bajo r), la conversación se mantiene tranquila.

Oscilación: con más stickers, el grupo entra en dinámicas repetitivas: un día todos responden, al siguiente nadie (ciclo de 2).

Caos: si se pasan de stickers (alto r), el grupo es incontrolable: 300 mensajes en 5 minutos y luego silencio total.

Defensa: el “estado” X es el nivel de actividad del grupo, el r es la tasa de memes compartidos.