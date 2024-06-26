Projeto Final: Engajamento Comunitário
Descrição
Este projeto é uma API RESTful para processamento de requisições de um cliente HTTP, com foco em engajamento comunitário. As principais funcionalidades incluem um sistema de match para voluntários, gerenciamento de donativos e mapeamento de abrigos.

Estrutura do Projeto
projetoFinal ├── .idea ├── src │ ├── main │ │ ├── java │ │ │ ├── org │ │ │ │ ├── example │ │ │ │ │ ├── controller │ │ │ │ │ │ ├── AjudaController.java │ │ │ │ │ │ ├── VoluntarioController.java │ │ │ │ │ │ ├── DonativoController.java │ │ │ │ │ │ ├── AbrigoController.java │ │ │ │ │ ├── model │ │ │ │ │ │ ├── Voluntario.java │ │ │ │ │ │ ├── Donativo.java │ │ │ │ │ │ ├── Abrigo.java │ │ │ │ │ ├── repository │ │ │ │ │ │ ├── VoluntarioRepository.java │ │ │ │ │ │ ├── DonativoRepository.java │ │ │ │ │ │ ├── AbrigoRepository.java │ │ │ │ │ ├── service │ │ │ │ │ │ ├── VoluntarioService.java │ │ │ │ │ │ ├── DonativoService.java │ │ │ │ │ │ ├── AbrigoService.java │ │ │ │ ├── ProjetoFinalApplication.java │ ├── test ├── .gitignore ├── pom.xml └── README.md

Dependências
Java 11 ou superior
Spring Boot 2.5.4 ou superior
Maven 3.6.3 ou superior
Como Executar
Clone o repositório:
git clone https://github.com/seu-usuario/projetoFinal.git
cd projetoFinal
Compile e execute o projeto:

bash Copiar código mvn clean install mvn spring-boot:run Acesse a API em http://localhost:8080.

Endpoints da API Voluntários GET /voluntarios: Retorna todos os voluntários. GET /voluntarios/{id}: Retorna um voluntário pelo ID. POST /voluntarios: Cria um novo voluntário. DELETE /voluntarios/{id}: Deleta um voluntário pelo ID. Donativos GET /donativos: Retorna todos os donativos. GET /donativos/{id}: Retorna um donativo pelo ID. POST /donativos: Cria um novo donativo. DELETE /donativos/{id}: Deleta um donativo pelo ID. Abrigos GET /abrigos: Retorna todos os abrigos. GET /abrigos/{id}: Retorna um abrigo pelo ID. POST /abrigos: Cria um novo abrigo. DELETE /abrigos/{id}: Deleta um abrigo pelo ID. Ajuda GET /ajuda: Retorna informações sobre os estudantes, nome do projeto e tema do projeto.

{ "estudantes": ["fulano", "beltrano"], "projeto": "nome do projeto", "tema": "tema do projeto" } Estrutura dos Pacotes controller: Contém os controladores REST. model: Contém as entidades JPA. repository: Contém as interfaces de repositório que estendem JpaRepository. service: Contém as classes de serviço que implementam a lógica de negócios. Contribuições Para contribuir com o projeto, faça um fork do repositório, crie uma branch com suas modificações e envie um pull request.

Licença Este projeto está licenciado sob os termos da licença MIT. Veja o arquivo LICENSE para mais detalhes.
