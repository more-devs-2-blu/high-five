<h1 align="center">Documentação Back-End</h1>


````markdown
## Getting started

### Pré-requisitos

- Não é necessário criar o banco de dados, somente ter instalado o MySQL.
- Back-end do projeto desenvolvido com Spring Boot v2.7.0: É importante importá-lo como projeto Maven, dentro de sua IDE.
- O Usuário poderá usar o Eclipse ou Spring Tools Suite.
- Java 11.


### Instalando Back-End

1. Faça o Download do ZIP do projeto e extraia para algum diretório em seu computador. 
2. Abra o Eclipse, clique em File>Import. 
3. Selecione a opção: "Existing Maven Project" e clique em Next.
4. Clique em Browse e selecione o diretório no qual está o projeto. 
5. Next>Finish. 
6. Após a importação do projeto 
7. No Package Explorer selecionar a classe Main e então clicar na opção de Run as Java Application. 
````

#

<h2 align= "center">Diagrama Banco de Dados</h2>

#
<img src = "https://user-images.githubusercontent.com/88169337/170603208-cd4c9555-8cf8-4ec4-b4e9-320b46b030f1.jpg" class="center">


#

<h2 align= "center">Endpoints</h2>

#




| Função | Método | url |
| ------ | ------ | ------ |
| Get All reviews by product id | GET |  http://localhost:8080/api/customer-review/{id}
| Get All Products | GET | http://localhost:8080/api/product
| Get Product by id | GET | http://localhost:8080/api/product/{id} 
| Get Size by id | GET |  http://localhost:8080/api/size/{id}   
| Get Fit | GET |  http://localhost:8080/api/size/fit/{id}
| Create Customer | POST | http://localhost:8080/api/customer







