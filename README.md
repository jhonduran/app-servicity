# Servicity

Aplicación en desarrollo para la gestión de servicios y usuarios.  
Este proyecto forma parte de un sistema que busca digitalizar la administración de servicios, técnicos y clientes.

## 🚀 Tecnologías

- **Lenguaje:** Java (100%)  
- **Construcción:** Gradle con Kotlin DSL (`build.gradle.kts`)  
- **IDE recomendado:** IntelliJ IDEA / NetBeans / VS Code con extensiones de Java  
- **Gestión de dependencias:** Gradle Wrapper (`gradlew`)  

## 📂 Estructura del proyecto

app-servicity/
 app/ # Código fuente principal
 
 src/
 
 main/java # Lógica de la aplicación

 main/resources # Configuración y recursos

 test # Pruebas unitarias

 gradle/ # Configuración de Gradle

 build.gradle.kts # Configuración del proyecto

 settings.gradle.kts # Ajustes de módulos

 gradlew / gradlew.bat # Ejecutables de Gradle Wrapper

  ## .gitignore

## ⚙️ Instalación y ejecución

1. Clona el repositorio:
   ```bash
   git clone https://github.com/jhonduran/app-servicity.git
   cd app-servicity

   ## Construye el proyecto:
   
./gradlew build

Ejecuta la aplicación:

./gradlew run

## configuracion 

Modifica src/main/resources/application.properties (o .yml) para ajustar:

Base de datos

Puerto del servidor

Parámetros de seguridad / JWT (si aplica)

 
 Funcionalidades (en progreso)

Registro y autenticación de usuarios

Gestión de servicios

Panel de administración
API REST para integración con aplicaciones móviles


Contribución......

Haz un fork del repositorio

Crea una rama (git checkout -b feature/nueva-funcionalidad)

Haz commit de tus cambios (git commit -m 'Agrego nueva funcionalidad')

Sube la rama (git push origin feature/nueva-funcionalidad)

Abre un Pull Request

📄 Licencia

Este proyecto se distribuye bajo la licencia MIT.
Consulta el archivo de licencia en [LICENSE](LICENSE)
 para más detalles.
