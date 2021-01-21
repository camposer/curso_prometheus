# Todos los servicios

1. Node exporter:
```
# Para Linux, Unix, Mac
./node_exporter 
# Para Windows
./windows_exporter
```

2. Prometheus:
```
docker run -p 9090:9090 -v /Users/rcampos/github/prometheus/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus
```

3. Base de Datos:
```
docker run -p 13306:3306 -e MYSQL_ROOT_PASSWORD=123456 mysql
```

4. Aplicación:
```
docker run -p 8080:8080 -e MYSQL_HOST=host.docker.internal micrometer-demo
```
NOTA: Debe haber construido la imagen de docker previamente

5. MySQL exporter:
```
docker run -p 9104:9104 -e DATA_SOURCE_NAME="root:123456@(host.docker.internal:13306)/" prom/mysqld-exporter
```

## Mejoras futuras

Escribir un script de docker-compose que levante todos estos servicios
