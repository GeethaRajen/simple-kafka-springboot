<img width="28" height="19" alt="image" src="https://github.com/user-attachments/assets/42b45288-3b3e-4167-b102-3dc67d95fef4" /> A simple Spring boot project to use kafka with REST API.

<img width="28" height="19" alt="image" src="https://github.com/user-attachments/assets/42b45288-3b3e-4167-b102-3dc67d95fef4" />This project contains single REST API - POST /investments/ideas. Can be tested with http://localhost:8080/swagger-ui/index.html#/

<img width="28" height="19" alt="image" src="https://github.com/user-attachments/assets/42b45288-3b3e-4167-b102-3dc67d95fef4" />The json object submitted with this POST request will be published by Kafka producer to topic "investment-tips". Consumers listening to the Kafka topic will consume the message.

<img width="28" height="19" alt="image" src="https://github.com/user-attachments/assets/42b45288-3b3e-4167-b102-3dc67d95fef4" />Multiple consumers can be enabled by running kafka-console-consumer.bat on different terminals.

<b>Kafka Classes</b>

<img width="770" height="455" alt="image" src="https://github.com/user-attachments/assets/1fa8b0fa-fbdc-47d1-af8c-46341177f736" />
