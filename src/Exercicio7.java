public class Exercicio7 {
    
    public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setNome("Pedro");
		a1.setP1(8);
		a1.setP2(7);

		System.out.println(a1.getNome() + " tirou nota " + a1.getP1() + " na p1 e " + a1.getP2() + " na p2");

		Aluno a2 = a1;
		a2.setP1(7);
		a2.setP2(8);

		System.out.println(a2.getNome() + " tirou nota " + a2.getP1() + " na p1 e " + a2.getP2() + " na p2");
	}
}

