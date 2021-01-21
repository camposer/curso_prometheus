# Ejercicio 1

1. Validar instalación de docker. Abrir una consola de windows o cualquier otro sistema operativo y ejercutar:
```
docker --version
```

2. Descargar archivo de configuración de Prometheus de ejemplo:
https://github.com/prometheus/prometheus/blob/master/documentation/examples/prometheus.yml

3. Iniciar un contenedor de Prometheus con el archivo YAML descargado en el paso anterior:
https://prometheus.io/docs/prometheus/latest/installation/
```
docker run \
    -p 9090:9090 \
    -v /path/to/prometheus.yml:/etc/prometheus/prometheus.yml \
    prom/prometheus
```

Importante: Utilice una ruta absoluta para la dirección del archivo de configuración. Por ejemplo:
C:\Users\rodolfo\prometheus\prometheus.yml

4. Entrar a la UI de Prometheus:
http://localhost:9090

5. En la UI de graph ver los valores para las métricas: up y prometheus_http_requests_total
