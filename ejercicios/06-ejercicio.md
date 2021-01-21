# Ejercicio 6

1. Configurar e iniciar alertmanager
* Utilizando el siguiente ejemplo: https://medium.com/devops-dudes/prometheus-alerting-with-alertmanager-e1bbba8e6a8e
* Crear el archivo alertmanager.yml
* Remover el receiver de slack y trabajar sólo con correo electrónico
* Puede utilizar como servidor SMTP el siguiente cliente: http://nilhcem.com/FakeSMTP/
* Iniciar alertmanager:
```
docker run -p 9093:9093 -v /Users/rcampos/github/prometheus/alertmanager.yml:/etc/alertmanager/alertmanager.yml prom/alertmanager
```

2. Configurar alertas en Prometheus
* Crear el archivo de reglas, puede utilizar las siguientes reglas: https://medium.com/devops-dudes/prometheus-alerting-with-alertmanager-e1bbba8e6a8e
* Añadir la ruta del alertmanager y definir la ubicación de las nuevas reglas
* Iniciar Prometheus (montando una carpeta en lugar del archivo de configuración):
```
docker run -p 9090:9090 -v /Users/rcampos/github/prometheus/config:/etc/prometheus prom/prometheus
```

3. Ver alertas en las UI de Prometheus, AlertManager y FakeSMTP
