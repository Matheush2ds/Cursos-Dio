const totalSalas = parseInt(gets());

// Arrays com salas contendo tesouros e monstros
const salasComTesouro = [2, 4, 7];
const salasComMonstro = [3, 6, 8];

// Loop para percorrer cada sala da masmorra
for (let sala = 1; sala <= totalSalas; sala++) {
    // Utilizamos o .includes() para verificar se um número está presente nos arrays
    const temTesouro = salasComTesouro.includes(sala);
    const temMonstro = salasComMonstro.includes(sala);

    // Condições para verificar e exibir se há tesouro ou monstro na sala
    if (temTesouro) {
        print("Tesouro na sala " + sala + "!");
    } else if (temMonstro) {
        print("Monstro na sala " + sala + "!");
    }
}
