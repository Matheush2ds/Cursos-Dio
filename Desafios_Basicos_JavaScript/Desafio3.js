let escolhaDoTreinador = parseInt(gets());
let pokemonEscolhido; 

// Condições para identificar o Pokémon escolhido
if (escolhaDoTreinador === 1) {
    pokemonEscolhido = "Bulbasaur";
} else if (escolhaDoTreinador === 2) {
    pokemonEscolhido = "Charmander";
} else if (escolhaDoTreinador === 4) {
    pokemonEscolhido = "Pikachu";
} else if (escolhaDoTreinador === 5) {
    pokemonEscolhido = "Mewtwo";
}

// Imprime o Pokémon escolhido
if (pokemonEscolhido) {
    print("Voce escolheu o " + pokemonEscolhido + " como seu Pokemon inicial.");
}