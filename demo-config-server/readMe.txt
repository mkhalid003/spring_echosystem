Only Working after using the below property
spring.cloud.config.server.native.searchLocations=file:C://Users//x209663//git//config-repo

http://localhost:8888/hello-service/qa
{"name":"hello-service","profiles":["qa"],"label":null,"version":null,"state":null,"propertySources":[{"name":"file:C://Users//x209663//git//config-repo/hello-service-qa.properties","source":{"message":"Hello world - this message is from QA"}},{"name":"file:C://Users//x209663//git//config-repo/hello-service.properties","source":{"message":"Hello world - this message is from config server"}}]}

Work on:
https://howtodoinjava.com/spring-cloud/microservices-monitoring/
https://cloud.spring.io/spring-cloud-config/multi/multi__spring_cloud_config_server.html