class Main {
	public static void main(String args[]) {
		Pessoa a;
		a = new Pessoa();
		a.nome = "Eduardo Rubi Cardoso";
		a.idade = 23;
		a.anoNascimento = 1995;
		a.altura = 1.71;
		System.out.println(a.nome);
		System.out.println(a.idade+"\n"+a.anoNascimento+"\n"+a.altura);
		//System.out.println(a.anoNascimento);
		//System.out.println(a.altura);
	}
}