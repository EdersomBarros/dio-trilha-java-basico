# 🚀 Desafio Conta Bancária - DIO

## 📝 Introdução

Este projeto implementa uma simulação de conta bancária em Java, permitindo ao usuário criar uma conta, consultar saldo e realizar operações básicas. O projeto foi desenvolvido para o desafio da trilha de Java básico da DIO.

## ✨ Funcionalidades

- **Criação de conta:** O usuário pode digitar o nome do cliente, código da agência, número da conta e saldo inicial para criar uma nova conta bancária.
- **Consulta de saldo:** O saldo da conta pode ser consultado a qualquer momento.
- **Operações:**
  - **Depósito:** O usuário pode depositar um valor na conta.
  - **Saque:** O usuário pode sacar um valor da conta, desde que o saldo disponível seja suficiente.

## 💻 Implementação

O código principal do projeto está na classe `ContaTerminal`. Ela utiliza a classe `Scanner` para obter os dados digitados pelo usuário e cria objetos das classes `Cliente`, `Agencia`, `ContaBanco` e `Impressora` para gerenciar a conta bancária. A classe `Impressora` é responsável por exibir as mensagens na tela.

## 📋 Requisitos

- Java Development Kit (JDK) instalado
- IDE Java (opcional)

## 📚 Instruções de Uso

1. Compile o código Java usando o seguinte comando:
   ```sh
   javac ContaTerminal.java

 ## 📈 Exemplos de Uso
1. Criação de conta:
    Por favor, digite o nome do Cliente: João Silva
    Por favor, digite o código da Agencia: 1234
    Por favor, digite o número da Conta: 56789
    Por favor, digite o saldo inicial: 1000.00
    Conta criada com sucesso!

 ## 🤝 Contribuições
 Sinta-se à vontade para contribuir com este projeto sugerindo melhorias ou implementando novas funcionalidades.
