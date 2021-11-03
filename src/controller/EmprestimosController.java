package controller;

import java.util.*;
import model.*;

public class EmprestimosController {
  ArrayList<Emprestimos> livrosEmprestados = new ArrayList<>();

  protected Integer search(int idLivroPesquisado) {
    for (int i = 0; i <= livrosEmprestados.size() - 1; i++) {
      Emprestimos temporario = livrosEmprestados.get(i);
      int idTemp = temporario.getIdLivro();
      if(idTemp == idLivroPesquisado){
        return idLivroPesquisado;
      }
    }
    return null;
  }

  public boolean addEmprestimo(Emprestimos alugado) {
    int idLivro = alugado.getIdLivro();
    if(search(idLivro) == null){
      livrosEmprestados.add(alugado);  
      return true;
    }
   return false;
  }

}
