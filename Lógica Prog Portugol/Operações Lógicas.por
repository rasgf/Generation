programa
{
	
	funcao inicio()
	{
		cadeia pais
		inteiro idade
		logico permissao
		escreva("Country/país? (BR, USA, POR)\n")
		leia(pais)
		limpa()
		se(pais == "BR" ou pais == "POR"){
			escreva("Idade: ")
		}senao{
			escreva("Age: ")
		}
		
		leia(idade)
		limpa()

		se((pais == "BR" e idade >= 18) ou (pais == "USA" e idade >=21) ou pais == "POR"){
			permissao = verdadeiro
		}senao{
			permissao = falso
		}

		se(permissao e (pais == "POR" ou pais == "BR")){
			escreva("Permitido.") 
		}senao se(permissao e pais == "USA"){
			escreva("Allowed.")
		}senao se(nao permissao e pais=="USA"){
			escreva("Not allowed.")
		}senao se(nao permissao e (pais == "POR" ou pais == "BR")){
			escreva("Não permitido.")
		}
	}
}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 356; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */