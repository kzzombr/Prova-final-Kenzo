package dominio;

import java.util.NoSuchElementException;
import java.util.Set;

public class NoBuscaBinaria {

  private Produto produto;
  private NoBuscaBinaria esquerda;
  private NoBuscaBinaria direita;

  public NoBuscaBinaria(Produto produto) {
    this.esquerda = null;
    this.direita = null;
    this.produto = produto;
  }

  public static void montaArvore(NoBuscaBinaria novo, NoBuscaBinaria arvore) {
    if (arvore == null)
      arvore = novo;
    else {
      if (novo.produto.getCodigo() < arvore.produto.getCodigo()) {
        if (arvore.esquerda == null) {
          arvore.esquerda = novo;
        } else {
          montaArvore(novo, arvore.esquerda);
        }
      } else {
        if (arvore.direita == null) {
          arvore.direita = novo;
        } else {
          montaArvore(novo, arvore.direita);
        }
      }
    }
  }

  public static Produto buscaNo(NoBuscaBinaria arvore, Integer valor) {
    if (arvore == null) {
      throw new NoSuchElementException("Nao ha produto cadastrado para o codigo informado!");
    } else if (arvore.produto.getCodigo() == valor) {
      return arvore.produto;
    } else {
      if (arvore.produto.getCodigo() > valor) {
        return buscaNo(arvore.esquerda, valor);
      } else {
        return buscaNo(arvore.direita, valor);
      }
    }
  }

  public static void obtemProdutosCadastrados(NoBuscaBinaria arvore, Set<Produto> produtos) {
    produtos.add(arvore.produto);

    if (arvore.esquerda != null) {
      obtemProdutosCadastrados(arvore.esquerda, produtos);
    }
    if (arvore.direita != null) {
      obtemProdutosCadastrados(arvore.direita, produtos);
    }
  }
  
  public static int calcularAlturaDaArvore(NoBuscaBinaria arvore) {
    if(arvore == null)
      return 0;
    
    return 1 + Math.max(calcularAlturaDaArvore(arvore.esquerda), calcularAlturaDaArvore(arvore.direita));
  }
  
}
