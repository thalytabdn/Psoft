# Implementação de parte do jogo Mario Bross

O personagem Mario pode ficar pequeno, grande, com fogo ou morrer dependendo de algumas ações, como pegar cogumelo, pegar flor ou levar um dano. 


Na implementação utilizou-se o padrão de projeto State, o qual permite que um objeto 
altere seu comportamento quando seu estado interno muda. Para permitir a variação de comportamentos
foi utilizada uma composição entre Mario e MarioState, onde cada classe que implementa a interface MarioState apresenta um comportamento diferente para o objeto.