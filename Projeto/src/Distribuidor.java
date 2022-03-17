public class Distribuidor extends Thread{

	private String empresa;
	private Lote loteX;
	
	// M�todo Contrutor
	public Distribuidor(String empresa, Lote loteX) {
		super(empresa);
		this.empresa = empresa;
		this.loteX = loteX;
	}
	
	public void run(){
		try{
			for(int i = 0; i < 10; i++){
				loteX.Compra(50, empresa);
				Thread.sleep(1000);
			}
		}catch(Exception e){
			loteX.error();
		}	
	}
}