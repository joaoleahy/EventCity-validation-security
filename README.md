# EventCity Validation and Security
Trata-se de um desafio do bootcamp DevSuperior no qual criamos um sistema de eventos e cidades. Neste projeto fazemos algumas validações e implementamos o servidor de autenticação e o servidor de recursos.

![image](https://user-images.githubusercontent.com/86070920/209897181-8629521f-fba1-4703-8305-d4baec0272ef.png)

![image](https://user-images.githubusercontent.com/86070920/209897200-72d6b25d-12cb-4d99-a957-1eccfbd71a11.png)

## Rotas:
Neste sistema, somente as rotas de leitura (GET) de eventos e cidades são públicas (não precisa de login). 
Usuários CLIENT podem também inserir (POST) novos eventos. Os demais acessos são permitidos apenas a usuários ADMIN.

## Validações da entidade City:
- Nome não pode ser vazio

## Validações da entidade Event:
- Nome não pode ser vazio
- Data não pode ser passada
- Cidade não pode ser nula

## Competências adquiridas:
- Modelo de dados de usuários e perfis
- Validação com Bean Validation
- Annotations
- Customizando a resposta HTTP
- Autenticação e autorização
- Spring Security
- OAuth 2.0
- Token JWT
- Autorização de rotas por perfil


## 🚀 Tecnologias

Esta API foi desenvolvida com as seguintes tecnologias:

-  [Java](https://www.java.com/pt_BR/)
-  [OAuth 2.0](https://oauth.net/2/)
-  [Spring](https://spring.io/projects/spring-framework)
- [Spring Security](https://spring.io/projects/spring-security)
-  [Postman](https://www.postman.com/)
- [Intellij](https://www.jetbrains.com/pt-br/idea/)
-  [H2 database] (SQL)


