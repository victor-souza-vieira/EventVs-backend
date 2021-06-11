## EventVs

Projeto da disciplina de engenharia de Software 2. <br />
O EventVs consiste num projeto onde é possível criar e divulgar eventos de qualquer natureza.

A seguir virão alguns pontos importante a respeito do desenvolvimento do projeto.

### Como executar o projeto
1. É necessário ter o java na versão 11 instalado.
1. É necessário possuir algum servidor local na máquina.
1. É necessário iniciar o serviço apache e o mysql na máquina.
1. É preciso baixar as dependências do projeto utilizando o Maven ``` mvn clean install ```
1. Após esses passos basta executar a classe ``` EventvsApplication.java ```

### Recomendações
1. Utilizar o servidor local ``` XAMP ```
1. Utilizar o IDE ``` Intellij Community ```

Apesar das recomendações, fique a vontade para utilizar o servidor local e IDE da sua preferência.

### Estrutura do código

No pacote ```domain``` ficam todos os arquivos responsáveis pelas regras de domínio do negócio. <br /> 
O pacote ``` domain/model``` contém as classes de entidade. <br />
O pacote ``` domain/repository``` contém todos os acessos ao banco de dados. <br />
O pacote ``` domain/controller``` contém todos os controladores que orquestram os casos de uso. <br />
O pacote ``` domain/enums``` contém todos os enumeradores que serão utilizados no domínio. <br />
No pacote ``` api``` ficam todos os arquivos responsáveis pelo funcionamento da API. <br />
O pacote ``` api/resources``` contém todos os arquivos responsáveis pelo atendimento às requisições. HTTP <br />
O pacote ``` api/util``` contém todos os arquivos que terão alguma utilidade, mas não se encaixam em outro pacote. <br />
O pacote ``` api/dto``` contém todos os DTO's (Data Transfers Objects) utilizados para comunicação. <br />
O pacote ``` api/dto/requests``` contém todos os DTO's especializados nas ***requests***.  <br />
O pactote ``` api/dto/responses``` contém todos os DTO'S especializados nas ***responses***. <br />


### Fluxo de desenvolvimento

1. Criar uma branch
1. Criar a query no repository, quando necessário.
1. Criar o enum quando for necessário.
1. Criar e Documentar o método no controlador.
1. Criar o DTO de request, caso a sua requisição envie parâmetros no corpo.
1. Criar o DTO de response, caso a sua resposta não seja exatamente uma entidade.
1. Criar o path da requisição, quando este não existir.
1. Criar e Documentar o método no seu respectivo resource.
1. Testar localmente.
1. Realizar o commit na sua branch
1. Por fim submeter um merge request para a branch master.
1. OBS: A documentação citada anteriormente se refere a criação do javadoc. Para criar o javadoc basta inserir acima do método
o seguinte trecho: <br />
   ```
   /**
    * Descreva em breves palavras o que seu método faz
    *
    * @param adicione aqui os parametros do seu método
    * @return adicione aqui o retorno do seu método
    * */
    ```

### Features

- [ ] Criar categoria de evento.
- [x] Listar todas as categorias de eventos.
- [x] Buscar categorias de evento pelo nome.
- [ ] Criar evento.
- [ ] Publicar evento.
- [ ] Editar evento.
- [ ] Excluir evento não publicado.
- [ ] Cancelar evento.
- [ ] Inscrever-se em um evento.
- [ ] Cancelar inscrição num evento.
- [ ] Listar participantes de um evento.

   




