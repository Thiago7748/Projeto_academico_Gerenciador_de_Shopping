# Gerenciador de Lojas de Shopping Center em Java

Este projeto é um sistema em Java para gerenciar lojas e produtos dentro de um shopping center, desenvolvido como um exercício de Programação Orientada a Objetos.

## Visão Geral

O sistema permite cadastrar diferentes tipos de lojas (Vestuário, Alimentação, etc.), gerenciar produtos com controle de validade, e administrar o estoque de cada loja. Também gerencia o shopping como um todo, contendo múltiplas lojas e permitindo consultas básicas.

## Principais Funcionalidades

* Criação e gerenciamento de Lojas (com atributos como nome, endereço, funcionários) e tipos especializados (Cosmético, Vestuário, Alimentação, Bijuteria, Informática).
* Cadastro e gerenciamento de Produtos (nome, preço, data de validade), com verificação de vencimento.
* Gestão de estoque de produtos por loja (inserir, remover, listar).
* Administração de um Shopping com múltiplas lojas (inserir, remover, listar por tipo).
* Menu interativo via console para operações básicas.

## Tecnologias Utilizadas

* Java

## Como Compilar e Executar

1.  **Pré-requisitos:**
    * JDK (Java Development Kit) instalado.
2.  **Compilação:**
    * Navegue até o diretório com os arquivos `.java`.
    * Compile os arquivos:
        ```bash
        javac *.java
        ```
3.  **Execução:**
    * Execute a classe principal (assumindo que se chama `Principal`):
        ```bash
        java Principal
        ```
