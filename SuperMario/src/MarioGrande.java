public class MarioGrande implements MarioState {

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("+ 1000 pontos");
        return this;
    }

    @Override
    public MarioState levarDano() {
        System.out.println("Mario Pequeno");
        return new MarioPequeno();
    }

    @Override
    public MarioState pegarFlor() {
        System.out.println("Mario com Fogo");
        return new MarioFogo();
    }

}
