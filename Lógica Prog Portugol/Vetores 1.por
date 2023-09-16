programa
{
	
	funcao inicio()
	{
/* EX:1	forma "extensa" de declarar o vetor
		 cadeia nome[5]

		nome[0] = "Marcelo"
		nome[1] = "Tiago"
		nome[2] = "Juliana"
		nome[3] = "Priscila"
		nome[4] = "Mauricio"

		escreva(nome[2])*/
		
/* EX:2	outra forma de declarar o vetor e fazer o programa ler todos os "dados" contidos nele, um de 
		 *  cada vez, sempre da primeira posição (0) até a última (3), totalizando 4.
		 cadeia cat[] = {"Ni","Pt","Pd","Rh"}

		para(inteiro i = 0; i<=3; i++){
			escreva(cat[i] + "\n")
		}*/
		cadeia nome[5]
		para(inteiro i = 0; i<=4; i++){
			escreva("Digite a posição "+i+": ")
			leia(nome[i])
			limpa()
		}
		para(inteiro i = 0; i<=4; i++){
			escreva(i + ": "+nome[i]+" | ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 242; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */