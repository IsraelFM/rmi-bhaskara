# COM242 - SISTEMAS DISTRIBUIDOS (09/09/2020)

## Exercício

Implemente um programa em RMI onde uma estação cliente envia valores para um servidor, o qual executa uma função e retorna os resultados para o cliente. Para o caso, o cliente envia os valores de três variáveis (a, b e c) de uma equação de 2º grau, o servidor utiliza a fórmula de Bhaskara para calcular as coordenadas x' e x'' e retorna os resultados para o cliente. Como teste considere a equação do 2º grau 2x² – 16x – 18 = 0.

## Entrega

Você deverá postar um documento com no máximo 05 páginas que descreva o método que você implementou. Inclua imagens de trechos de código considerados importantes, de telas que mostrem os resultados. Comente o código e as imagens que colocar, fale das dificuldades que você teve nesta atividade. Caso tenha conseguido configurar duas máquinas inclua imagens mostrando a conexão. Se preferir envie um vídeo (máx. 2 min) em que você faz os comentários do código, fala das dificuldades e mostra o funcionamento do programa.

### RMI - PROCEDIMENTOS PARA EXECUÇÃO DO PROGRAMA

1. Certifique se a conexão entre as máquinas cliente e servidor está livre ou se está sendo bloqueada por um firewall ou antivirus. Para isso, teste o ping sobre as duas perspectivas (ping cliente para servidor e depois servidor para cliente).

2. No arquivo do código cliente (Cliente.java), atualize o endereço IP para o do servidor atual.

3. Prossiga de acordo com o seu sistema operacional.

> Obs.: Sempre execute os comandos a partir do diretório raiz (Bhaskara):

#### Windows

1. Faça a compilação do programa tanto no Cliente como no Servidor através do comando:
`javac ClienteCalc/*.java && javac ClienteCalc/*.java`

2. Comando para criação dos stubs sob demanda
`start rmiregistry`

3. Inicie em um terminal, o Servidor:
`java ServidorCalc/Servidor`

4. Inicie em um outro terminal, o Cliente:
`java ClienteCalc/Cliente`

#### Linux

Você pode usar o Makefile:

1. Compile o programa Cliente e Servidor:
`make javac`

2. Inicie o Servidor de Nomes:
`rmiregistry`

3. Inicie em um terminal, o Servidor:
`make java:servidor`

4. Inicie em um outro terminal, o Cliente:
`make java:cliente`

## Ambiente de teste

```bash
israelfm@israelfm:~/workspace/sd/Bhaskara$ lsb_release -a

Distributor ID:	Ubuntu
Description:	Ubuntu 20.04.1 LTS
Release:	20.04
```

```bash
israelfm@israelfm:~/workspace/sd/Bhaskara$ java -version

openjdk version "11.0.8" 2020-07-14
OpenJDK Runtime Environment (build 11.0.8+10-post-Ubuntu-0ubuntu120.04)
OpenJDK 64-Bit Server VM (build 11.0.8+10-post-Ubuntu-0ubuntu120.04, mixed mode, sharing)
```

## Issues
Em caso de problemas na compilação ou execução, sinta-se a vontade para abrir uma issue. Eu verificarei a causa e retornarei o mais breve possível.
