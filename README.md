
# 📘 Proyecto Reserva Hotel

Este es un sistema básico de gestión de reservas para un hotel, desarrollado con **Java 17** y **Spring Boot 3.5.0**, que permite gestionar la lógica principal de reservas. El proyecto incluye pruebas unitarias y está configurado para ejecutarse con métricas de calidad mediante **GitHub Actions**.

## 🛠️ Tecnologías Utilizadas

- Java 17
- Spring Boot 3.5.0
- Maven
- JUnit 5
- H2 Database
- JaCoCo (cobertura de código)
- Checkstyle (análisis de estilo)
- SpotBugs (análisis estático)
- GitHub Actions (CI/CD)

---

## 📂 Estructura del Proyecto

```
reserva-hotel/
├── src/
│   ├── main/java/com/hotel/reserva_hotel/
│   │   ├── controller/
│   │   ├── model/
│   │   ├── service/
│   │   └── ReservaHotelApplication.java
│   └── test/java/com/hotel/reserva_hotel/
│       └── service/ReservaServiceTest.java
├── .github/workflows/ci.yml
├── pom.xml
└── README.md
```

---

## ▶️ Ejecución Local

### Requisitos:
- Java 17+
- Maven

### Pasos:
1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/reserva-hotel.git
   cd reserva-hotel
   ```

2. Ejecuta la aplicación:
   ```bash
   mvn spring-boot:run
   ```

3. Accede en el navegador:
   ```
   http://localhost:8080
   ```

4. H2 Console:
   ```
   http://localhost:8080/h2-console
   ```

---

## 🧪 Pruebas Unitarias

Las pruebas se encuentran en `src/test/java` y se ejecutan con:

```bash
mvn test
```

La clase principal de pruebas es:

- `ReservaServiceTest.java`: Verifica la lógica de reservas agregando, eliminando y listando reservas.

---

## 📊 Análisis de Calidad de Código

Este proyecto utiliza 3 herramientas integradas en el `pom.xml` para garantizar la calidad del código:

### ✔️ Checkstyle

Detecta violaciones de estilo de código según las reglas de Google.  
Ejecución:
```bash
mvn checkstyle:checkstyle
```
> 📄 El reporte se genera en: `target/site/checkstyle.html`

### 🐞 SpotBugs

Analiza errores potenciales de lógica y código ineficiente.

Ejecución:
```bash
mvn spotbugs:spotbugs
```
> 📄 El reporte se genera en: `target/spotbugsXml.xml` y `spotbugs.html`

### 📈 JaCoCo

Calcula la cobertura de código alcanzada por las pruebas.

Ejecución:
```bash
mvn jacoco:report
```
> 📄 El reporte se encuentra en: `target/site/jacoco/index.html`

---

## 🔁 Integración Continua con GitHub Actions

El proyecto incluye un flujo de trabajo automático en `.github/workflows/ci.yml` que realiza:

- Compilación (`mvn clean install`)
- Ejecución de pruebas (`mvn test`)
- Generación de reportes:
  - JaCoCo
  - Checkstyle
  - SpotBugs

Puedes ver el pipeline en la pestaña **Actions** del repositorio.

---

## 📌 Conclusiones

Este proyecto demuestra buenas prácticas de desarrollo Java con énfasis en:

- Calidad del código
- Automatización de pruebas
- Cobertura y estilo
- Herramientas de análisis estático

Se corrigieron errores detectados por las herramientas y se mejoró la calidad general del proyecto en cada iteración.

---

## 📄 Licencia

Este proyecto es de uso académico y fue desarrollado como parte del curso de Ingeniería de Software.
