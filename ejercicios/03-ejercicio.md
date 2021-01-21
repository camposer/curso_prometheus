# Ejercicio 3

1. Crear la imagen del proyecto micrometer-demo
```
cd micrometer-demo
docker build -t micrometer-demo .
```

2. Iniciar el proyecto
```
docker run -p 8080:8080 micrometer-demo
```
* Comprobar que el API Rest funciona correctamente: `curl http://localhost:8080/hola`

3. Registrar el nuevo target en Prometheus, ver ejemplo:
```
  - job_name: 'micrometer-demo'
    metrics_path: '/actuator/prometheus'
    scrape_interval: 5s
    static_configs:
    - targets: ['host.docker.internal:8080']
```

4. Jugar con las métricas de JVM utilizando PromQL 
* Conseguir una métrica de contador
* Conseguir una métrica de medición (gauge)
* Obtener vectores de rangos para las métricas mencionadas anteriormente
* Hacer operaciones de suma, ordenación y rates
