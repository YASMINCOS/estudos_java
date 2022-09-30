
public class OpLogicos {

	public static void main(String[] args) {
		//operador ternario
		//if(n1>n2){
		//maior =n1
		//}else {
		//	maior=n2
		//}
		
		//maior= n1>n2? n1:n2;
		
		int n1,n2,r;
		
		n1=4;
		n2=8;
		//se n1 for maior que n2- false
		//r recebe 1
		r= (n1>n2)? n1+n2:n2-n1;
		System.out.println(r);
		
		//maior >
		//menor<
		
		String nome1="Gustavo";
		String nome2="Gustavo";
		//nao possui a mesma estrutura, portanto nao sao iguais, apenas o conteudo e igual
		String nome3= new String("Gustavo");
		String res;
		res=(nome1==nome2)? "igual":"diferente";
		System.out.println(res);
		
		//verificando o conteudo
		String conteudo;
		conteudo=(nome1.equals(nome3))?"igual":"diferente";
		System.out.println(conteudo);
		
		//operadores logicos && 
		//||
		//^ ou exclusivo
		//! nao falso= true
		//p //q //p&&q
		//v //v    =v
		//v //f    =f
		//f //v    =f
		//f //f    =f
		
		//p //q //p||q
		//v //v    =v
		//v //f    =v
		//f //v    =v
		//f //f    =f
		
		//p //q //p||q
		//v //v    =v
		//v //f    =v
		//f //v    =v
		//f //f    =f
		
		//p //q //p^q
		//v //v    =f
		//v //f    =v
		//f //v    =v
		//f //f    =f
		
		//p !p
		//v f
		//f v
				
	}
}
