class Hero {
    constructor(nome, idade, tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    atacar() {
        const ataque = this.getAtaque();
        const mensagem = `O ${this.tipo} atacou usando ${ataque}`;
        console.log(mensagem);
    }

    getAtaque() {
        switch (this.tipo) {
            case "mago":
                return "magia";
            case "guerreiro":
                return "espada";
            case "monge":
                return "artes marciais";
            case "ninja":
                return "shuriken";
            default:
                return "ataque indefinido";
        }
    }
}

module.exports = Hero;
