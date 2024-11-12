# Desafio Técnico - Verificação de Anagramas

## Objetivo
O objetivo deste desafio é criar uma solução em Java para verificar se duas strings são anagramas entre si. Em seguida, escrever testes automatizados para validar a implementação.

## Descrição do Problema
Anagramas são palavras ou frases que podem ser formadas reorganizando as letras de outra, sem adicionar ou remover caracteres. Por exemplo:
"listen" é um anagrama de "silent"
"evil" é um anagrama de "vile"
"triangle" é um anagrama de "integral"
A solução proposta deve ter um método que determine se duas strings fornecidas são anagramas.

## Requisitos
O código deve ser escrito em Java.
A solução deve ser implementada de maneira eficiente e clara.
A verificação de anagramas deve levar em consideração:
Caso as strings sejam null ou de tamanhos diferentes, elas não podem ser anagramas.
As comparações devem ser feitas de forma insensível a maiúsculas e minúsculas.
O método deve lidar com strings vazias como entradas válidas.


## Como Rodar os Testes
### Requisitos
> Java 8 ou superior
> Maven ou Gradle para gerenciamento de dependências (caso queira rodar os testes pela linha de comando)

Passos para rodar os testes:
Clonar o repositório: Clone este repositório para sua máquina local:
```sh
git clone https://github.com/MSBarbieri/anagram-test.git
cd anagram-test
```
Construir o projeto (se necessário): Caso esteja utilizando Maven, rode o seguinte comando para compilar o projeto e resolver as dependências:

```sh
mvn clean install
```

Rodar os testes: Para rodar os testes, utilize o comando Maven:
```sh
mvn test
```
