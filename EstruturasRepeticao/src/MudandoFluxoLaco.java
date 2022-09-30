
public class MudandoFluxoLaco {

	public static void main(String[] args) {
		int cc=0;
		while(cc<10) {
			cc++;
			if(cc==5|| cc==7) {
				//nao vai mostrar, volta o enquanto
				continue;
			}else if(cc==9){
				continue;
			}else if(cc==6){
				//breqak joga para fora do laco
				break;
			}
			System.out.println("Cambolhata: "+cc);
		}
	}
}
