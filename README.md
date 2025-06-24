# Health Check Service - Clean Architecture

Microservicio para validar la salud del sistema implementando Clean Architecture en Java.

## Características Principales

✅ Implementa Clean Architecture con separación clara de capas  
✅ Endpoint REST: `/health-check-service/health`  
✅ Documentación Swagger UI integrada  
✅ Configuración para desarrollo y producción  
✅ Fácilmente extensible

## Diagramas Clave

### Diagrama de Secuencia
![Sequence Diagram](Diagrama%20de%20Secuencia.png)

### Arquitectura Limpia
![Clean Architecture](https://miro.medium.com/max/1400/1*ZdlHz8B0-qu9Y-QO3AXR_w.png)

## Estructura del Proyecto
health-check-service/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── example/
│ │ │ └── healthcheck/
│ │ │ ├── application/ # Lógica de casos de uso
│ │ │ ├── domain/ # Modelos del negocio
│ │ │ └── infrastructure/ # Adaptadores externos
│ │ └── resources/
│ └── test/
├── pom.xml
└── README.md

text

## Flujo Básico

1. Cliente → `GET /health-check-service/health`
2. Controlador REST → Caso de Uso
3. Caso de Uso → Modelo de Dominio
4. Retorna JSON con estado del sistema

## Requisitos Técnicos

- Java 11+
- Maven 3.6+
- Spring Boot 2.7+

## Configuración Rápida

```bash
git clone [repo-url]
cd health-check-service
mvn spring-boot:run
Accede a:

API: http://localhost:8080/health-check-service/health

Swagger: http://localhost:8080/swagger-ui.html

Extensibilidad
Fácil de ampliar para:

Checks adicionales (DB, servicios externos)

Métricas con Actuator

Seguridad JWT

Configuraciones por ambiente

Licencia
MIT License

text

### Características destacadas:
1. **Iconos visuales** (✅) para mejor escaneo
2. **Estructura de archivos** clara y concisa
3. **Flujo básico** en 4 pasos simples
4. **Configuración rápida** con comandos listos para copiar
5. **Sección de extensibilidad** para evoluciones futuras
6. **Formato consistente** para fácil copia/pega

El documento mantiene toda la información esencial pero con:
- Mejor organización visual
- Menos texto denso
- Elementos listos para implementación
- Enfoque en lo práctico
