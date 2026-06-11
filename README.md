# Simulador de Votación Simple

Programa CLI para procesar votos desarrollado en Java como actividad práctica sobre desarrollo colaborativo usando GIT y GITHUB.

## Integrantes

- Alejandro Sarmiento Plata
- Jose Camilo Bobadilla Puello
- Gabriela Utria Jimenez
- Maria Fernananda Vasquez Castro

## Roles

| Rol   | Integrante                       | Rama                                      |
|-------|----------------------------------|-------------------------------------------|
| Dev 1 | Gabriela Utria Jimenez           | `feature/votos-candidato-a`               |
| Dev 2 | Maria Fernananda Vasquez Castro  | `feature/votos-candidato-b`               |
| Dev 3 | Alejandro Sarmiento Plata        | `feature/calcular-porcentajes`            |
| Dev 4 | Jose Camilo Bobadilla Puello     | `feature/ganador`                         |
| Integrador | Jose Camilo Bobadilla Puello | repositorio principal                     |

## Funcionalidades

1. **Registrar votos para el candidato A** - Permite ingresar la cantidad de votos para el candidato A y los acumula.
2. **Registrar votos para el candidato B** - Permite ingresar la cantidad de votos para el candidato B y los acumula.
3. **Calcular porcentajes de votación** - Calcula y muestra el porcentaje de votos obtenido por cada candidato sobre el total emitido.
4. **Determinar ganador** - Compara los votos de ambos candidatos y determina quién ganó o si hay empate.

## Instrucciones de ejecución

### Requisitos

- Tener instalado Java Development Kit (JDK) 8 o superior.
- Tener acceso a una terminal o línea de comandos.

### Pasos

1. Abrir una terminal en el directorio del proyecto.
2. Compilar el archivo fuente:
   ```bash
   javac SimuladorVotacion.java
   ```
3. Ejecutar el programa:
   ```bash
   java SimuladorVotacion
   ```
4. Una vez en ejecución, se muestra un menú con las siguientes opciones:
   ```
   ================================================
      BIENVENIDO AL SIMULADOR DE VOTACIÓN SIMPLE
   ================================================

   Menú de Opciones:
   1. Registrar votos para Candidato A
   2. Registrar votos para Candidato B
   3. Ver porcentajes de votación
   4. Determinar ganador
   5. Salir
   Seleccione una opción:
   ```
5. Ingresar el número de la opción deseada y presionar Enter.
6. Para las opciones 1 y 2, ingresar la cantidad de votos cuando se solicite.
7. Repetir hasta seleccionar la opción 5 para salir.

### Ejemplo de uso

```
Seleccione una opción: 1
Ingrese cantidad de votos para Candidato A: 30
Se registraron: 30 votos para el candidato A

Seleccione una opción: 2
Ingrese cantidad de votos para Candidato B: 20
Se registraron: 20 votos para el candidato B

Seleccione una opción: 3

--- Porcentajes de Votación ---
Porcentaje Candidato A: 60.00%
Porcentaje Candidato B: 40.00%
Total de votos: 50

Seleccione una opción: 4
¡El ganador es el Candidato A con 30 votos!

Seleccione una opción: 5
Saliendo del simulador de votación. ¡Hasta luego!
```

## Evidencias del flujo colaborativo

### Configuración del repositorio

1. El integrador (Jose Camilo Bobadilla Puello) creó el repositorio público en GitHub y agregó a los 3 compañeros como colaboradores.
2. Se protegió la rama `main` con las siguientes reglas:
   - No permitir commits directos a `main`.
   - Exigir Pull Request para cada integración.
   - Exigir mínimo 1 aprobación antes del merge.
3. Cada desarrollador trabajó en su propia rama `feature/*` y nunca directamente sobre `main`.

### Flujo de trabajo por funcionalidad

Cada funcionalidad siguió el mismo ciclo:

1. Crear rama propia: `git checkout -b feature/nombre-funcionalidad`
2. Desarrollar y commitar localmente.
3. Subir la rama: `git push origin feature/nombre-funcionalidad`
4. Crear Pull Request en GitHub hacia `main`.
5. Recibir revisión de al menos un compañero (comentario y aprobación).
6. Fusionar (merge) el PR a `main`.
7. Eliminar la rama remota después del merge.
8. Los demás integrantes hacer `git pull origin main` para actualizar su copia local.

### Historial de GIT

```
*   b8bda9c limpieza de archivos y configurar archivo gitignore
*   60ad959 Merge pull request #1 (feature/calcular-porcentajes)
|\
| *   6c5336e Merge branch 'main' into feature/calcular-porcentajes
| |\
| |/
|/|
* |   307d736 Merge pull request #3 (feature/votos-candidato-a)
|\ \
| * | f1a4a20 Agregar funcionalidad para registrar votos del candidato A
* | |   41f5358 Merge pull request #2 (feature/ganador)
|\ \ \
| * | | d8bb7dc agregar archivo .gitignore
| * | | 9a0d9bf Agregar funcionalidad determinar ganador
| |/ /
* | |   a7749e4 Merge pull request #4 (feature/votos-candidato-b)
|\ \ \
| |/ /
|/| |
| * | 516489e agregar funcionalidad de registrar votos del candidato B
|/ /
| * 2b766e6 Agregar calcular porcentaje
| * b54c197 Agregar calcular porcentaje
|/
* f95245a first commit (esqueleto inicial)
```

### Resumen de Pull Requests

| PR # | Autor                           | Rama fusionada                 | Aprobado por                 |
|------|----------------------------------|--------------------------------|------------------------------|
| #1   | Alejandro Sarmiento Plata        | `feature/calcular-porcentajes` | Jose Camilo Bobadilla Puello |
| #2   | Jose Camilo Bobadilla Puello     | `feature/ganador`              | Alejandro Sarmiento Plata    |
| #3   | Gabriela Utria Jimenez           | `feature/votos-candidato-a`    | Jose Camilo Bobadilla Puello |
| #4   | Maria Fernananda Vasquez Castro  | `feature/votos-candidato-b`    | Jose Camilo Bobadilla Puello       |

### Detalle de cada Pull Request

| PR  | Cambios introducidos                                                                 |
|-----|--------------------------------------------------------------------------------------|
| #1  | Función `calcularPorcentajes()`: calcula y muestra porcentaje de votos por candidato |
| #2  | Función `determinarGanador()`: compara votos y muestra ganador o empate              |
| #3  | Función `registrarVotoCandidatoA()`: registra y acumula votos del candidato A        |
| #4  | Función `registrarVotoCandidatoB()`: registra y acumula votos del candidato B        |

Cada funcionalidad fue desarrollada en una rama independiente, integrada mediante Pull Request con revisión de otro compañero, y fusionada a `main` cumpliendo la regla de oro del taller: **nadie desarrolló directamente en main**.
