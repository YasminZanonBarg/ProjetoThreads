public class Principal {

	public static void main(String[] args) {
		
		// Instânciando nossos objetos criados:
		Lote loteX = new Lote(650);
		Distribuidor teletex = new Distribuidor("Teletex", loteX);
		Distribuidor autodata = new Distribuidor("Autodata", loteX);
		Distribuidor wdc = new Distribuidor("Wdc", loteX);
		Distribuidor anixter = new Distribuidor("Anixter", loteX);
		
		// Executando a Threads (run):
		teletex.start();
		autodata.start();
		wdc.start();
		anixter.start();
	}

}
