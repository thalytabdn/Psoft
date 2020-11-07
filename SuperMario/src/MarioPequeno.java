public class MarioPequeno implements MarioState{

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Mario Grande");
        return new MarioGrande();
    }

    @Override
    public MarioState levarDano() {
       return null;
    }

    @Override
    public MarioState pegarFlor() {
        System.out.println("Mario Fogo");
        return new MarioFogo();
    }

}
