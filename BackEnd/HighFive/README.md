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

## Configurando o banco de dados em Application Properties para o primeiro acesso: 

````markdown

spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.ddl-auto = update

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

#spring.sql.init.mode=always
spring.datasource.url = jdbc:mysql://localhost:3306/highfive?createDatabaseIfNotExist=true&serverTimezone=UTC
spring.datasource.username = root
spring.datasource.password = admin
````

* Atentar-se para alterar usuário e senha se necessário.
* No primeiro acesso descomentar a linha 9, para que seja inserido uma carga inicial de informação no banco de dados. 

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

````markdown
O propósito do método abaixo é retornar o percentual de FIT da pessoa levando em consideração o feedback da comunidade:

// método para retornar o cálculo do fit da comunidade
	public SizeDTO getFit(Long id) {
		Size size = repository.findById(id).orElseThrow(() -> new NotFoundException("Size " + id + " not found"));
		List<CustomerReviewDTO> review = reviewService.getAllByProduct(size.getProduct().getId());
		
		// Só será feito o calculo caso tenha mais de 5 avaliações nesse produto
		if (review.size() > 5) {
			
			double totalFit = 0;
			double fitCommunity = 0;
			int i = 0;
			
			for (CustomerReviewDTO customer : review) {
				
				// Compara as pessoas que fizeram a avaliação com a pessoa que está fazendo o cálculo
				// customer.getCustomer = clientes que fizeram a avaliação
				// size.getCustomer = cliente que esta fazendo cálculo
						
				double diferencaAltura = customer.getCustomer().getHeightCustomer() - size.getCustomer().getHeight();
				double diferencaPeso = customer.getCustomer().getWeightCustomer() - size.getCustomer().getWeight();
				
				// Se a diferença de altura e peso do cliente que está fazendo o cálculo não foi maior que 5 pra mais ou menos
				// entra no if para calcular o fit da comunidade que tem um peso e altura similar
				
				if (diferencaAltura < 5 && diferencaAltura > -5 && diferencaPeso < 5 && diferencaPeso > -5 ) {
					totalFit += (customer.getLengthReview() + customer.getModelingReview() + customer.getWaistReview()) / 3;
					i++;
				}
			}	
			
			// Por fim o fit da comunidade é igual ao total dos fits das pessoas que tem um peso e altura similar dividido pelo  
			// quantidade de pessoas
			
			fitCommunity = totalFit / i;
			size.setCommunityFit(fitCommunity);		
			
			// Presumimos que a empresa já teria esse calculo e também pela questão do tempo optamos por não faze-lo,
			// então somente é feito um set com um valor de exemplo no fit calculado pela empresa
			
			size.setCalculatedFit(80);
			
		}
		return size.convertToDTO();
	}
	


````





