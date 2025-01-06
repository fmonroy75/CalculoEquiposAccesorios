# Equipos y Accesorios de Elevación

Este conjunto de aplicaciones está diseñado para gestionar y calcular aspectos clave relacionados con el uso de equipos de elevación, garantizando la seguridad y eficiencia en los trabajos de levantamiento. Las aplicaciones cubren diversas áreas, como la capacidad de la grúa, la presión sobre el suelo, y la selección de ganchos y grilletes, con el objetivo de asegurar que los equipos y accesorios sean adecuados para la carga y el entorno de trabajo.

## Cálculos y Fórmulas

### 1. **Capacidad de Grúa y Gancho**
Este cálculo verifica la capacidad nominal de la grúa y determina el radio de trabajo. Se utiliza para asegurarse de que la grúa pueda manejar la carga de manera segura.

**Fórmula:**

\[
\text{Momentum} = \text{Peso} \times \text{Gravedad} \times \text{Radio}
\]

- **Peso**: Peso de la carga en kilogramos (kg).
- **Gravedad**: Valor constante de 9.81 m/s² (aceleración debido a la gravedad).
- **Radio**: Distancia entre la grúa y el punto de carga.

La fórmula se usa para verificar si el **Momentum** calculado está dentro de la capacidad de la grúa. Si el **Momentum** calculado excede la capacidad, no se podrá realizar el levantamiento.

### 2. **Cálculo de Presión en el Suelo**
Este cálculo determina si el suelo puede soportar la presión ejercida por la carga, asegurando que el terreno sea adecuado para levantar objetos pesados sin causar daños.

**Fórmula:**

\[
\text{Presión en el Suelo} = \frac{\text{Peso}}{\text{Área}}
\]

- **Peso**: Peso total de la carga en kilogramos (kg), convertido a Newtons (N).
- **Área**: El área de la base de apoyo sobre el suelo en metros cuadrados (m²).

La presión calculada debe compararse con la capacidad máxima que el suelo puede soportar. Si la presión supera la capacidad del suelo, se necesita una base más fuerte o una distribución mejorada de la carga.

### 3. **Selección de Ganchos y Grilletes**
Este cálculo determina el equipo necesario para conectar tirantes y otros accesorios, verificando que los ganchos y grilletes sean adecuados para soportar el peso de la carga.

**Fórmula:**

\[
\text{Fuerza de Trabajo} = \text{Peso} \times \text{Factor de Seguridad}
\]

- **Peso**: Peso de la carga en kilogramos (kg).
- **Factor de Seguridad**: Un valor adimensional que representa un margen de seguridad, que generalmente varía entre 5 y 10 dependiendo del tipo de carga y condiciones de trabajo.

La **Fuerza de Trabajo** calculada debe ser menor o igual a la capacidad de carga máxima de los ganchos y grilletes seleccionados.


### 4. **Punto de choque de una pieza con respecto a la pluma**
basado en la semejanza de triángulos y nos servirá para obtener el punto de choque de la pieza con respecto a la geometría de la pluma.  Esto  nos permitirá saber  hasta  que altura  puedo levantar la carga. 

**Fórmula:**



\[
\text{largo pluma sacado} = \frac{\text{Radio}}{\text{cos(angulo)}}
\]

\[
\text{Altura Choque} = \text{Largo Pluma} - \text{largo pluma sacado}
\]


- **Radio**: Distancia desde el tirante.
- **Angulo**: Angulo de la pluma con respecto al suelo.
- **Largo Pluma**: Largo de la pluma.
- **Altura Choque**:altura  puedo levantar la carga

---

## Conclusión

Estas aplicaciones son esenciales para el cálculo y la validación de la capacidad de los equipos de elevación, la seguridad del suelo y la correcta selección de los accesorios. Utilizando las fórmulas mencionadas, los operadores pueden asegurarse de que están trabajando dentro de los límites de seguridad establecidos, evitando fallos o accidentes durante el levantamiento de cargas pesadas.


### Lenguaje de programacon: Kotlin

### Autor: Francisco Monroy