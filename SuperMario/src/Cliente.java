
public class Cliente {

	public static void main(String[] args) {
		Mario mario = new Mario();
	    try {
			mario.pegarCogumelo();
		    mario.levarDano();
		    mario.pegarFlor();
		    mario.pegarFlor();
		    mario.levarDano();
			mario.levarDano();
			mario.pegarCogumelo();
		    mario.levarDano();
		    mario.levarDano();
		    mario.levarDano();
	    } catch(Exception e) {
				System.out.println();
				System.out.println("Acabou o jogo");
				System.out.println("Pontuação: " + mario.getPontuacao());
	    }
	}
}
