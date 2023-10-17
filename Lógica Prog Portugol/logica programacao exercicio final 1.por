programa
{
	
	funcao inicio()
	{
	 inteiro n, m, aux
        inteiro num[10] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
        para(n=0; n<10; n++){
            para (m=n + 1; m<10; m++) {
                se (num[n]<num[m]) {
                    aux = num[n]
                    num[n] = num[m]
                    num[m] = aux
                }
            }
        }
        
        para (n = 0; n < 10; n++) {
            escreva(num[n], " ")
        }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 409; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */