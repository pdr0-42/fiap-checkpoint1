# fiap-checkpoint1
* Comando docker para executar o app a partir do docker hub com o profile "dev"

```
docker run -d -p 8080:8080 -e PROFILE=dev pvini0403/fiap-checkpoint1 
```

* Comando docker para executar o app a partir do docker hub com o profile "prd"

```
docker run -d -p 8080:8080 -e PROFILE=prd pvini0403/fiap-checkpoint1 
```

* Comando docker para executar a aplicação a partir do docker hub com o profile "stg"

```
docker run -d -p 8080:8080 -e PROFILE=stg pvini0403/fiap-checkpoint1  
```