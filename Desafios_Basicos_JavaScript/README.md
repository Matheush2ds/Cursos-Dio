# Desafio 1 Jornada do Herói pela Floresta

## Descrição

Você é um jovem herói em uma missão épica para derrotar um temível dragão que aterroriza o reino. No entanto, para alcançar a caverna do dragão, você deve atravessar uma floresta perigosa. Cada passo que você der é crucial, e o sucesso de sua jornada dependerá da sua lógica afiada.

## Tarefa

Escreva um algoritmo que simule a jornada do herói pela floresta. O herói começa em uma posição inicial e deve dar uma série de passos para atravessar a floresta até chegar à caverna do dragão.

## Entrada

- A posição inicial do herói na floresta (um número inteiro).
- O número total de passos que o herói deve dar (um número inteiro).

## Saída

Imprima a posição final do herói após dar a quantidade especificada de passos.

## Exemplos

### Exemplo:

| Entrada | Saída                  |
|---------|------------------------|
| 2       | Posicao final do heroi: 5 |

| Entrada | Saída                  |
|---------|------------------------|
| 15      | Posicao final do heroi: 18|

| Entrada | Saída                  |
|---------|------------------------|
| 10      | Posicao final do heroi: 16|



# Desafio 2 Simulação de Ganho de XP após Derrotar um Monstro

## Descrição

Você é um herói em um mundo mágico repleto de monstros e desafios. Sua missão agora é enfrentar inimigos e ganhar pontos de experiência (XP) para se tornar mais forte. A cada vitória, você ganha XP e se aproxima de se tornar um lendário campeão.

## Tarefa

Escreva um programa simples que simule o ganho de XP após derrotar um monstro. O programa deve calcular e exibir a quantidade de XP ganhos com base no nível do monstro e na dificuldade da batalha.

### Cálculo do XP

Para calcular a quantidade de XP ganhos, o programa precisa considerar o nível do monstro e a dificuldade da batalha. A fórmula `num1 * num2 * 100` é usada para calcular essa quantidade com base nos valores fornecidos.

#### Explicação:

- `num1`: Este é o nível do monstro. Quanto maior o nível do monstro, mais XP você ganhará ao derrotá-lo. Portanto, multiplicar o nível do monstro por um valor maior ajudará a refletir o aumento da recompensa de XP para monstros mais poderosos.

- `num2`: Este é o valor da dificuldade da batalha, variando de 1 a 100. Quanto maior a dificuldade da batalha, mais XP você deve ganhar para enfrentar um desafio maior. Multiplicar pela dificuldade ajuda a ajustar a recompensa de XP com base na intensidade da batalha.

- `100`: Este é o multiplicador constante que determina a escala geral de recompensa de XP. Multiplicar pelo nível do monstro e pela dificuldade aumenta a recompensa em 100 vezes o valor do nível e da dificuldade.

## Entrada

- O nível do monstro (um número inteiro).
- A dificuldade da batalha, representada por um valor de 1 a 100 (um número inteiro).

## Saída

Imprima a quantidade de XP ganhos após a batalha.

## Exemplos

| Entrada | Saída                    |
|---------|--------------------------|
| 45      | Voce ganhou 180000 XP!   |
| 40      |                          |

| Entrada | Saída                    |
|---------|--------------------------|
| 41      | Voce ganhou 155800 XP!   |
| 38      |                          |

| Entrada | Saída                    |
|---------|--------------------------|
| 15      | Voce ganhou 30000 XP!    |
| 20      |                          |



# Desafio 3 Escolha do Pokémon Inicial

## Descrição

No mundo dos jogos Pokémon, os treinadores começam sua jornada escolhendo um dos três Pokémons iniciais: Bulbasaur, Charmander e Mewtwo. Cada treinador escolhe um dos quatro pokémons. Seu desafio é criar uma solução que permita ao jogador escolher um dos Pokémons iniciais e exibir uma mensagem de boas-vindas e o Pokémon escolhido.

## Entrada

Você receberá um número inteiro que representa a escolha do treinador: 1 para Bulbasaur, 2 para Charmander, 4 para Pikachu e 5 para Mewtwo.

## Saída

A saída deve ser uma mensagem de boas-vindas que inclua o nome do Pokémon escolhido.

## Exemplos

| Entrada | Saída                                      |
|---------|--------------------------------------------|
| 1       | Voce escolheu o Bulbasaur como seu Pokemon inicial. |
| 2       | Voce escolheu o Charmander como seu Pokemon inicial. |
| 4       | Voce escolheu o Pikachu como seu Pokemon inicial. |
| 5       | Voce escolheu o Mewtwo como seu Pokemon inicial. |


# Deafio 4 Exploração da Masmorra

## Descrição

Sua missão é vasculhar as salas da masmorra em busca de recompensas lendárias e desafios perigosos. Cada sala pode conter monstros formidáveis, tesouros preciosos ou ambos. Use suas habilidades estratégicas para enfrentar as ameaças e coletar os tesouros!

## Tarefa

Escreva um programa que simule sua jornada heróica pela masmorra. O programa deve percorrer cada sala e verificar se há tesouros ou monstros. Se você encontrar um tesouro, colecionará a recompensa. Se encontrar um monstro, terá que derrotá-lo para continuar.

### Atenção

Em nossa resolução utilizamos a função `.includes()` do JavaScript para verificar se um número (representando a sala atual) está presente nos arrays `salasComTesouro` e `salasComMonstro`.

## Entrada

O número total de salas no dungeon (um número inteiro).

## Saída

Sempre que encontrar um tesouro, imprima " Tesouro na sala X!".

Sempre que encontrar um monstro, imprima "Monstro na sala X!".

## Exemplos

| Entrada | Saída                             |
|---------|-----------------------------------|
| 3       | Tesouro na sala 2!                |
|         | Monstro na sala 3!                |

| Entrada | Saída                             |
|---------|-----------------------------------|
| 4       | Tesouro na sala 2!                |
|         | Monstro na sala 3!                |
|         | Tesouro na sala 4!                |

| Entrada | Saída                             |
|---------|-----------------------------------|
| 2       | Tesouro na sala 2!                |



# Desafio 5 Coleta de Minérios com Picareta

## Descrição

Você é um mestre construtor em um mundo de blocos e tem a tarefa de gerar biomas em diferentes regiões do mundo. Cada bioma tem características únicas, como tipos de solo, vegetação e clima.

## Tarefa

Sua tarefa é coletar minérios enquanto ataca uma rocha com sua picareta. Use loops e lógica de programação para representar cada golpe na rocha e determinar qual minério foi obtido.

## Entrada

O programa irá solicitar que você digite um número inteiro positivo representando a quantidade de golpes que você deseja dar com a picareta.

## Saída

Para cada golpe que você der, o programa exibirá uma mensagem indicando o resultado do golpe. Será mostrado o número do golpe e o minério obtido, que pode ser 1: Carvao, 2: Ferro, 3: Diamante e 4: Pedra.

## Exemplos

| Entrada | Saída                |
|---------|----------------------|
| 4       | 1: Carvao            |
|         | 2: Ferro             |
|         | 3: Diamante          |
|         | 4: Pedra             |

| Entrada | Saída                |
|---------|----------------------|
| 3       | 1: Carvao            |
|         | 2: Ferro             |
|         | 3: Diamante          |

| Entrada | Saída                |
|---------|----------------------|
| 2       | 1: Carvao            |
|         | 2: Ferro             |
