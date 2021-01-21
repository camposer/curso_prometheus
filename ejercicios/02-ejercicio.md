# Ejercicio 2

1. Iniciar el exportador de windows. Para iniciar:
https://github.com/prometheus-community/windows_exporter/releases

2. Configurar en el archivo de configuración de Prometheus el endpoint del exportador
Para configurar el nuevo target podrá utilizar algo como esto (debajo de la sección static_context):
```
  - job_name: 'windows-exporter'
    metrics_path: '/metrics'
    scrape_interval: 5s
    static_configs:
    - targets: ['host.docker.internal:9100']
```

NOTA: 
- El target utilizado responde al hostname interno entre el container de docker y su host

3. Realizar diferentes queries sobre la data colectada del exportador de Windows. Para inspiración echar un ojo a:
https://prometheus.io/docs/prometheus/latest/querying/examples/
