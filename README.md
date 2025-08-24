# 📘 Solución Taller: Explorando Sistemas Dinámicos y Bifurcaciones

Este documento contiene las respuestas al **Taller: Explorando Sistemas Dinámicos y Bifurcaciones**, abordando aspectos teóricos, matemáticos, de programación y análisis crítico.

---

## 🔹 Parte Teórica

1. **¿Qué es un sistema dinámico?**  
   Un sistema dinámico es un modelo matemático que se encarga de estudiar la evolución de un sistema a través del tiempo.

2. **Diferencia entre:**
   - **Sistemas discretos y continuos:**  
     Los sistemas continuos tienen entradas y salidas continuas y sus variables cambian de forma pasiva con el tiempo, como en las ecuaciones diferenciales.  
     Los sistemas discretos cambian en pasos definidos o con variables específicas.

   - **Estabilidad y caos:**  
     Ambos siguen reglas deterministas, pero la diferencia radica en la predictibilidad.  
     En un sistema estable, el comportamiento futuro se puede predecir, mientras que en un sistema caótico no.

3. **Ejemplo real:**  
   El tráfico en una rotonda sin semáforos.

4. **Ecuación logística discreta:**

   ![Ecuación logística](formulas/logistica.png)

   - \( X_n \): Representa el crecimiento de la población u otra variable en el tiempo \( n \), entre 0 y 1.  
   - \( r \): Tasa de crecimiento.  
   - \( (1 - X_n) \): Representa los recursos limitados de \( X \).

5. **¿Qué pasa si \( r \) aumenta mucho?**  
   El sistema pasa de ser estable a oscilar, y finalmente entra en caos.

---

## 🔹 Análisis Matemático

1. **Puntos fijos:**

   ![Puntos fijos](formulas/puntos_fijos.png)

2. **Derivada y estabilidad:**

   ![Derivada](formulas/derivada.png)

   Sustituyendo en los puntos fijos:

   - En \(X = 0\):  
     
     ![Sustitución X=0](formulas/sustitucion_x0.png)

     Es estable si \( r < 1 \).

   - En \(X = 1 - \1/r\):  
     
     ![Sustitución X=1-1/r](formulas/sustitucion_x1.png)

     Es estable si \( 1 < r < 3 \).

3. **Interpretación:**  
   El punto fijo estable representa el equilibrio de la población (u otra variable) si no hay perturbaciones grandes.  
   Cuando este punto se vuelve inestable, el sistema deja de tener equilibrio y aparece el caos.

4. **Ecuación vista en clase (con presentación mejorada):**

   ![Ecuación logística](formulas/logistica.png)

---

## 🔹 Programación y Exploración

- **\( r = 2.5 \):** El sistema empieza a oscilar alrededor de \( 0.6 \).  
- **\( r = 3.2 \):** El sistema oscila entre aproximadamente \( 0.5 \) y \( 0.8 \).  
- **\( r = 3.8 \):** El sistema entra en caos: en cada iteración los valores son totalmente diferentes y no hay un patrón visible.

---

## 🔹 Diagrama de Bifurcaciones

1. **¿Dónde aparecen los puntos de bifurcación?**  
   El primero aparece aproximadamente cuando \( r = 3 \).

2. **¿En qué intervalos aparece el caos?**  
   Cuando \( r \) se aproxima a 3.5.

3. **¿Qué significado real puede tener esto?**  
   Al aumentar la tasa de crecimiento \( r \), un sistema aparentemente ordenado se vuelve impredecible.  
   Ejemplo: en la economía, puede pasar de estable a tener fluctuaciones intensas por pequeños cambios en los parámetros.

---

## 🔹 Análisis Crítico

1. **¿Por qué sistemas deterministas pueden generar caos?**  
   Porque, aunque la regla es fija, tienen una alta sensibilidad a las condiciones iniciales, lo que genera pequeñas diferencias que crecen con el tiempo, volviéndose impredecibles.

2. **Diferencias entre orden, caos y homeostasis:**
   - **Orden:** Comportamiento estable y predecible.  
   - **Caos:** Comportamiento irregular y sensible, sin patrones aparentes, impredecible.  
   - **Homeostasis:** Capacidad de un sistema de autorregularse o adaptarse para mantenerse estable frente a perturbaciones.

3. **Ejemplo real (grupo de WhatsApp y stickers):**
   - **Orden:** Con pocos stickers (bajo \( r \)), la conversación se mantiene tranquila.  
   - **Oscilación:** Con más stickers, el grupo entra en dinámicas repetitivas (ciclo de 2: un día todos responden, otro nadie).  
   - **Caos:** Si se exagera con los stickers (alto \( r \)), el grupo se vuelve incontrolable (300 mensajes en 5 minutos y luego silencio total).  

   **Defensa:**  
   - El “estado” \( X \) representa el nivel de actividad del grupo.  
   - \( r \) es la tasa de memes compartidos.

---

✍️ **Autor:** Solución elaborada a partir del taller original "Explorando Sistemas Dinámicos y Bifurcaciones".
