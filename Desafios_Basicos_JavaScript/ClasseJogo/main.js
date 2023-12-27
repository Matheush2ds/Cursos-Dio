const Hero = require('./Hero');

const heroiMago = new Hero("Merlin", 100, "mago");
const heroiGuerreiro = new Hero("Aragorn", 35, "guerreiro");
const heroiMonge = new Hero("Bruce Lee", 40, "monge");
const heroiNinja = new Hero("Hanzo", 25, "ninja");

heroiMago.atacar();
heroiGuerreiro.atacar();
heroiMonge.atacar();
heroiNinja.atacar();