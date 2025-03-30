
```markdown
# Aplicação de Controle de Projetos Elétricos e Hidrossanitários

Este repositório contém uma aplicação simples de controle e gestão de projetos elétricos e hidrossanitários. A aplicação foi desenvolvida utilizando **Java** e **Spring Boot**, com o objetivo de fornecer uma plataforma eficiente para profissionais da área de engenharia acompanharem, organizarem e gerenciarem os diferentes aspectos desses projetos.

## Funcionalidades

A aplicação oferece as seguintes funcionalidades:

- **Cadastro de Projetos**: Registro de projetos com informações como nome, descrição, data de início e previsão de término.
- **Controle de Etapas**: Acompanhamento das fases de execução dos projetos elétricos e hidrossanitários.
- **Armazenamento de Documentos**: Anexação de documentos técnicos e relatórios ao projeto, como plantas baixas e especificações.
- **Gestão de Recursos**: Controle dos materiais e recursos necessários para cada projeto.
- **Relatórios**: Geração e exportação de relatórios em formatos como PDF ou Excel.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Spring Boot**: Framework para desenvolvimento rápido e robusto de aplicações web.
- **Spring Data JPA**: Para persistência e manipulação de dados em banco de dados relacional.
- **Banco de Dados**: **PostgreSQL** como sistema de gerenciamento de banco de dados.
- **Thymeleaf**: Template engine para renderização de páginas HTML.
- **Maven**: Gerenciador de dependências e build do projeto.

## Pré-requisitos

Antes de rodar a aplicação, você precisará ter as seguintes ferramentas instaladas:

- **Java 8 ou superior**: Para compilar e rodar a aplicação.
- **Maven**: Para gerenciar as dependências e empacotar o projeto.
- **Banco de Dados PostgreSQL**: Para persistência dos dados.

## Como Rodar o Projeto

1. Clone este repositório para sua máquina local:

   ```bash
   git clone https://github.com/seu-usuario/controle-projetos-eletricos-hidrossanitarios.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd controleprojetos
   ```

3. Importe o projeto para a sua IDE preferida (ex: IntelliJ IDEA, Eclipse) ou rode diretamente pelo terminal.

4. Configure o banco de dados PostgreSQL no arquivo `application.properties` (localizado em `src/main/resources/application.properties`), com as credenciais do banco:

   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_banco
   spring.datasource.username=usuario
   spring.datasource.password=senha
   spring.jpa.hibernate.ddl-auto=update
   ```

5. Execute o projeto utilizando Maven:

   ```bash
   mvn spring-boot:run
   ```

6. Acesse a aplicação através do navegador no endereço:

   ```
   http://localhost:8080
   ```

## Estrutura de Diretórios

A estrutura de diretórios do projeto é organizada da seguinte maneira:

```
controle-projetos-eletricos-hidrossanitarios/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   └── suaempresa/
│   │   │   │       └── projetoseletricos/
│   │   │   │           ├── controller/    # Controladores (Controllers)
│   │   │   │           ├── model/         # Modelos de dados (Entities)
│   │   │   │           ├── repository/    # Repositórios (JPA Repositories)
│   │   │   │           ├── service/       # Lógica de negócios
│   │   │   │           └── ProjetosApplication.java  # Classe principal
│   │   └── resources/
│   │       ├── application.properties  # Configurações do banco de dados e da aplicação
│   │       ├── templates/              # Templates Thymeleaf (páginas HTML)
│   │       └── static/                 # Arquivos estáticos (CSS, JS, imagens)
│   └── test/                           # Testes unitários e de integração
│
├── pom.xml                            # Arquivo de configuração do Maven
└── README.md                          # Este arquivo
```

## Como Contribuir

Contribuições são bem-vindas! Caso queira contribuir com melhorias ou correções, sinta-se à vontade para abrir **issues** ou enviar **pull requests**. Para contribuir:

1. Faça um **fork** do repositório.
2. Crie uma **branch** para suas alterações: `git checkout -b minha-alteracao`.
3. Faça suas alterações e **commit** as mudanças: `git commit -am 'Adiciona nova funcionalidade'`.
4. **Push** para sua branch: `git push origin minha-alteracao`.
5. Abra um **pull request** para o repositório original.

```

Desenvolvido por **Marcus Torres**
