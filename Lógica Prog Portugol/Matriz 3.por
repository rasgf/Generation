programa
{
	
	funcao inicio()
	{
		cadeia nomes[3] = {"amanda","renato","agatha"}
		 real notas[3][4] = {{10.0,10.0,9.0,10.0},
									{9.0,7.0,8.0,7.0},
									{9.0,10.0,9.0,10.0}}
						
		
		real medias[3]
		
		para(inteiro l=0; l<3; l++){
			real sum = 0.0
			para(inteiro c = 0; c<4; c++){
				sum += notas[l][c]
			}
			medias[l] = sum/4
		}
		inteiro aluno
		escreva("Digite o numero do alune: ")
		leia(aluno)
		limpa()
		cadeia apr
		se(medias[aluno]>=6){
			apr="APROVADE"
		}
		senao{
			apr="REPROVADE"
		}
		escreva("===========","\n")
		escreva("aluno: "+nomes[aluno],"\n")
		escreva("===========","\n")
		escreva(" 1B : "+notas[aluno][0],"\n")
		escreva(" 2B : "+notas[aluno][1],"\n")
		escreva(" 3B : "+notas[aluno][2],"\n")
		escreva(" 4B : "+notas[aluno][3],"\n")
		escreva("===========","\n")
		escreva(" média : "+medias[aluno],"\n")
		escreva("   "+apr,"\n")
		escreva("===========","\n")
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 393; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {notas, 7, 8, 5}-{medias, 12, 7, 6}-{sum, 15, 8, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */