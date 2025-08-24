# Solución Taller: Explorando Sistemas Dinámicos y Bifurcaciones

## Teórico

1. **¿Qué es un sistema dinámico?**  
Un sistema dinámico es un modelo matemático el cual se encarga de ver la evolución de un sistema a través del tiempo.

2. **Diferencia entre:**  
- **Sistemas discretos y continuos:** Los sistemas continuos tienen entradas y salidas continuas y sus variables cambian de forma pasiva con el tiempo como las ecuaciones diferenciales, mientras que los sistemas discretos cambian con variables/pasos definidos.  
- **Estabilidad y caos:** Ambos siguen reglas deterministas pero la diferencia radica en la predictibilidad. En un sistema estable el comportamiento a futuro se puede predecir, mientras que cuando hay caos no se puede predecir.

3. **Ejemplo real:** El tráfico en una rotonda sin semáforos.

4.  

5.  
- Xn representa el crecimiento de la población u otra variable en n tiempo entre 0 y 1.  
- r representa la tasa de crecimiento.  
- (1 - Xn) representa los recursos limitados de X.

6. Si r aumenta mucho, el sistema pasa de estar estable a oscilar y finalmente a caos.

---

## Análisis Matemático

1. **Puntos fijos:** X = 0 y X = 1 - (1/r)  
2. **Derivada y estabilidad:**  
   f'(X) = r − 2rX  

   Sustituimos en X = 0 y X = 1 - (1/r):  
   - Es estable si r < 1  
   - Es estable si 1 < r < 3  

3. El punto fijo estable representa el equilibrio al que tiende la población u otra variable si no hay perturbaciones grandes. También, cuando este punto es inestable, el sistema deja de tener equilibrio y se vuelve caótico.

---

## Programación y Exploración

- ¿Qué pasa con Xn si r = 2.5?  
- ¿Qué pasa con r = 3.2?  
- ¿Qué ocurre con r = 3.8?  

**Respuesta:**  
En r = 2.5 el sistema empieza a oscilar alrededor de 0.6.  
Con r = 3.2 empieza a oscilar entre 0.5 y 0.8.  
En r = 3.8 ya es caos total: en cada iteración da valores totalmente diferentes y no se ve un patrón.

---

## Diagrama de Bifurcaciones

1. **¿Dónde aparecen los puntos de bifurcación?**  
La primera aparece aproximadamente cuando r = 3.

2. **¿En qué intervalos aparece el caos?**  
Aparece cuando r se aproxima a 3.5.

3. **¿Qué significado real puede tener esto?**  
Al aumentar la tasa de crecimiento r, el sistema que parecía ordenado se vuelve impredecible. Esto pasa, por ejemplo, en la economía, donde pasa de ser estable a tener fluctuaciones por pequeños parámetros.

---

## Análisis Crítico

1. **¿Por qué sistemas deterministas pueden generar caos?**  
Porque aunque la regla es fija, tiene una alta sensibilidad ante las condiciones iniciales, generando pequeñas diferencias que crecen con el tiempo volviéndose impredecibles.

2. **¿Qué diferencias encuentras entre orden, caos y homeostasis?**  
- **Orden:** Comportamiento estable y predecible.  
- **Caos:** Comportamiento irregular y sensible, sin patrones aparentes, haciéndolo impredecible.  
- **Homeostasis:** Es la capacidad de un sistema de autorregularse o adaptarse para mantenerse estable ante perturbaciones.

3. **Ejemplo aplicado: cantidad de stickers en un grupo de WhatsApp**  
- **Orden:** Con pocos stickers (bajo r), la conversación se mantiene tranquila.  
- **Oscilación:** Con más stickers, el grupo entra en dinámicas repetitivas: un día todos responden, al siguiente nadie (ciclo de 2).  
- **Caos:** Si se pasan de stickers (alto r), el grupo es incontrolable: 300 mensajes en 5 minutos y luego silencio total.  

**Defensa:** El “estado” X es el nivel de actividad del grupo, y r es la tasa de memes compartidos.
