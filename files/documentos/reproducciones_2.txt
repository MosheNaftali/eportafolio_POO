class Animal{
    constructor(patas, cola){
        this.patas = patas,
        this.cola = cola
    }
    orinar(){
        console.log('Pshhh')
    }
}
class Perro extends Animal{
    constructor(patas, cola, pulgas){
        super(patas,cola),
        this.pulgas = pulgas
    }
    ladrar(){
        console.log('Waff');
    }
}
class Chango extends Animal{
    constructor(patas, cola, comeBananas){
        super(patas,cola),
        this.comeBananas = comeBananas
    }
}
// const perro = new Animal(4,true);
// console.log(`El perri tiene ${perro.patas} patas.`)

let chango = new Animal(2,true);
let firulais = new Perro(4,true,true)
let chango2 = new Chango(2,true,true)
// Como vemos, si intentamos ejecutar chanco2.ladrar(), no me lo va a ejecutar porque no me lo heredó