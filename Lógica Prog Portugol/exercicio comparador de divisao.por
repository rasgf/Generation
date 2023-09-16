programa
{
	
	funcao inicio()
	{
		inteiro num, a, b
		logico verificador
		a=4
		b=9
		escreva("Digite um número: ")
		leia(num)
		se((num%a)==0) {
			verificador = verdadeiro
			escreva(verificador)
		}
		senao se((num%b)==0){
			verificador = verdadeiro
			escreva(verificador)
		}
		senao{
			verificador = falso
			escreva(verificador)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 192; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */