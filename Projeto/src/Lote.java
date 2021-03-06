import java.util.concurrent.Semaphore;

public class Lote {

	private int qtdProduto;
	private final Semaphore semaforo = new Semaphore(1);

	// M?todo construtor:
	public Lote(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}

	// Outros M?todos:
	public void error() {
		System.out.println("Quantidade solicitada insufici?nte. Lote atual com: " + qtdProduto + " produtos");
	}

	public void Compra(int quantidade, String empresa) {
		try {
			semaforo.acquire();
			if (qtdProduto >= quantidade) {
				int qtdProdutoAtualizado = this.qtdProduto - quantidade;
				this.qtdProduto = qtdProdutoAtualizado;
				System.out.println("A empresa " + empresa + " retirou " + quantidade
						+ " unidades do produto do lote. Estoque atual: " + qtdProduto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
	}
}
