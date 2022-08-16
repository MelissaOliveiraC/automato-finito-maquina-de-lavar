# AutomatoFinito_Maquina-de-Lavar
Trabalho de Teoria da Computação [Linguagens Regulares] implementação de Autômato Finito Determistico (AFD)


1  INTRODUÇÃO

A Máquina de Estados Finito é formada por um conjunto de estados e conjunto de regras e transições entre cada estado. Esta técnica bastante utilizada  devido a necessidade de pouco processamento e fácil compreensão. A utilização das máquinas de estado finito foi extremamente ampla, existem muitas possibilidades de implementação de máquinas de estado finito em software: desde instruções básicas de comutação, ponteiros de função (C, C++) até implementações baseadas em "padrão de estado" orientadas a objetos.
      
Embora ultrapassadas em relação às técnicas modernas de inteligência artificial, como agentes inteligentes, redes neurais, algoritmos genéticos, busca heurística, etc., as máquinas de estados finitos voltaram a ser usadas em larga escala em diferentes tipos de dispositivos. Esses dispositivos não suportam IA modernos pois o mesmo consome muitos recursos da máquina: CPU, memória, gráficos, som, entre outros. 

2  MÁQUINA DE LAVAR 

Para demonstração de um autômato finito utilizaremos como exemplo a implementação de uma máquina de lavar roupas, onde existem transições de estados que refletem em determinada ação.  

Para Implementação foi utilizada linguagem de programação JAVA

3 AUTÔMATO DA MÁQUINA DE LAVAR 

1 - q0 (Moeda) - Estado inicial onde deve ser inserido uma moeda, caso não seja inserida  continua no mesmo estado (espera da moeda). Após a inserção da moeda a máquina  poderá ser ligada; 

2 - q1 (Sabão) - Após ligar, deverá ser adicionado o sabão. Caso o sabão não for adicionado o estado Q1 ficará em espera até a ação ser feita;

3 - q2 (Lavar) - Após o sabão ser adicionado a Máquina realizará a função lavar;

4 - q3 (Centrifugar) - Realizar a função de Centrifugação; 

5 - qF  (Secar) - Realizar a função de Secagem e após isso, desliga;

4 REPRESENTAÇÃO GRÁFICA DO AUTÔMATO

<div align="center">
<img src="https://user-images.githubusercontent.com/107162134/184997730-6cf997aa-57d7-4704-b95a-26fcdb23734c.jpg" width="700px" />
</div>

5 INSTRUÇÕES DE EXECUÇÃO 

O código se baseia na ideia de sequência, dessa forma, para que seja concluído com sucesso o mesmo deve chegar ao seu final, isso será sinalizado por [FINAL] no terminal;

Para utilizar basta seguir as instruções que serão feitas pelo programa direto no terminal, tratando-se de um autômato de uma máquina de lavar o programa pedirá ao usuário entradas relaionadas, como por exemplo: sabão.

Se alguma das entradas for negada pelo usuário, seguindo a regra pré-estabelecida, o programa permanecerá no estado o qual a negação ocorreu até que seja atendida a necessidade.

6 EXEMPLOS DE FUNCIONAMENTO 

a) Primeiro exemplo: 

<div align="center">
<img src="https://user-images.githubusercontent.com/107162134/185001498-41766e0d-44c6-408a-96f3-8f30acf19489.png" width="400px" />
</div>

nesse caso, o programa ao pedir a moeda para o usuário recebe um negação do mesmo, representado por 'false', assim então, iniciando um loop até que a necessidade seja atendida, no caso a inserção da moeda.

b) Segundo exemplo:

<div align="center">
<img src="https://user-images.githubusercontent.com/107162134/185002110-54107b27-1c26-4bb0-b640-7075f1d8eb3c.png" width="400px" />
</div>

nesse outro exemplo, temos uma mudança de estado já que agora saímos de q0 e fomos para q1 [SABÃO], entretanto, o programa ao pedir para o usuário o sabão recebe uma negação fazendo novamente um loop que só terminará quando a necessidade for satisfeita, igual ao exemplo a.  

c) Terceiro exemplo: 

<div align="center">
<img src="https://user-images.githubusercontent.com/107162134/185002724-d73b6e87-3c7f-4434-bd2d-38fd9e0847b8.png"300px" />
</div>

já nesse exemplo, chegamos ao estado final, obviamente, após percorrer todos os outros estados seguindo a regra pré-estabelecida, como todas as necessidades da máquina foram satisfeitas a mensagem [FINAL] surge no terminal, indicando assim que a leitura foi concluída com sucesso.
