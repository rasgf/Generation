programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		cadeia nome
		real n1,n2,n3,media

		escreva("entre com seu nome: ")
		leia(nome)
		escreva("entre com a primeira nota: ")
		leia(n1)
		escreva("entre com a segunda nota: ")
		leia(n2)
		escreva("entre com a terceira nota: ")
		leia(n3)

		media=(n1+n2+n3)/3
		limpa()
		se (media>=7.0)
		{
			escreva("Aluno: ",nome,", parabéns, você foi aprovado com nota: ", mat.arredondar(media,2))
		}
		senao se(media>=4 e media<7)
		{
			escreva("Aluno: ",nome,", ficou de recuperação com nota: ", mat.arredondar(media,2))
		}
		senao 
		{
			escreva("Aluno: ",nome,", você foi reprovado com nota: ", mat.arredondar(media,2))
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 653; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */