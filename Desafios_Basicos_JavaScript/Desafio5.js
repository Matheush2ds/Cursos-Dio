// Lê a quantidade de golpes informada pelo usuário.
const quantidadeGolpes = parseInt(gets());

// Tipos de minerais: Carvao, Ferro, Diamante e Pedra
let minerais = ["Carvao", "Ferro", "Diamante", "Pedra"];

// Loop para cada golpe, de 1 até a quantidade informada
for (let i = 1; i <= quantidadeGolpes; i++) {
  // Calcula o índice do mineral usando o operador de módulo (%) para garantir que o índice esteja dentro do tamanho do array
  let minaIndex = (i - 1) % minerais.length; // Subtrai 1 para que o índice comece em 0
  
  // Exibe o índice i, concatena com o caractere ":", após, concatena com o tipo de minerais[minaIndex]
  print(i + ": " + minerais[minaIndex]);
}
