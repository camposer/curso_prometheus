# Ejercicio 4

1. Iniciar BD:
```
docker run -p 13306:3306 -e MYSQL_ROOT_PASSWORD=123456 mysql
```

* Para validar conectividad con la BD:
```
docker run -it --rm mysql mysql -hhost.docker.internal -uroot --password=123456 -P 13306
```

IMPORTANTE: La BD escucha en el puerto local 13306

2. Iniciar el proyecto
* Construir nuevamente la imagen (ver ejercicio 3)
* Iniciar nuevamente el contenedor (ver ejercicio 3)
* Especificar la variable de entorno MYSQL_HOST
```
docker run -p 8080:8080 -e MYSQL_HOST=host.docker.internal micrometer-demo
```

3. Configurar el mysql_exporter. Asegurarse de recolectar activamente métricas del windows_exporter

4. Observar las nuevas métricas añadidas al endpoint de prometheus por micrometer y mysql_exporter
* Prestar especial atención a las métricas relacionadas con: hikari, jvm_threads y jdbc
* Métricas que deberíamos tener disponibles en este momento: aplicación, mysql, windows, prometheus
