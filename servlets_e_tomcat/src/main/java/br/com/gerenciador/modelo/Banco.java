package br.com.gerenciador.modelo;

import javax.servlet.ServletException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {

    private static final List<Empresa> listaEmpresas = new ArrayList<Empresa>();
    private static final List<Usuario> listaUsuarios = new ArrayList<Usuario>();

    static {
        Empresa empresa = null;
        Empresa empresa2 = null;
        Empresa empresa3 = null;
        Empresa empresa4 = null;
        try {
            empresa = new Empresa("Alura", "123", "01/01/2021");
            empresa2 = new Empresa("Caelum", "123", "01/01/2021");
            empresa3 = new Empresa("São Judas", "123", "01/01/2021");
            empresa4 = new Empresa("São Mateus", "123", "01/01/2021");
        } catch (ServletException ex) {
            ex.getMessage();
            ex.getCause();
        }

        Banco banco = new Banco();
        banco.adiciona(empresa, empresa2, empresa3, empresa4);
        Usuario usuario = new Usuario();
        usuario.setLogin("admin");
        usuario.setPassword("admin");
        banco.adiciona(usuario);
    }

    /**
     * A partir do @param empresaId que foi passado como argumento, é feito um
     * foreach que compara o atributo Id de cada empresa com o @param empresaId para
     * retornar a empresa do respectivo @param empresaId.
     *
     * @param empresaId
     * @return empresa or null
     */
    public Empresa findEmpresaById(int empresaId) {
        for (Empresa empresa : listaEmpresas) {
            if (Integer.compare(empresa.getId(), empresaId) == 0) {
                return empresa;
            }
        }
        return null;
    }

    /**
     * Este método retorna um objeto apenas para que seja possível enviar parâmetros
     * ao listarEmpresas.jsp
     *
     * @param empresaId
     * @param newName
     * @param newCnpj
     * @return
     */
    public void editaEmpresa(int empresaId, String newName, String newCnpj) {
        Empresa modifiedEmpresa = findEmpresaById(empresaId);

        modifiedEmpresa.setCnpj(newCnpj);
        modifiedEmpresa.setName(newName);
    }

    /**
     * Adiciona uma ou várias empresas.
     *
     * @param empresa
     */
    public void adiciona(Empresa... empresa) {
        Collections.addAll(Banco.listaEmpresas, empresa);
    }

    public void adiciona(Usuario... usuario) {
        Collections.addAll(Banco.listaUsuarios, usuario);
    }

    public List<Empresa> getEmpresas() {
        return Banco.listaEmpresas;
    }

    /**
     * Busca a empresa a partir do empresaId através de um laço de repetição.
     *
     * @param empresaId
     */
    public void deleteEmpresa(int empresaId) {
        // Usando POO:
        Empresa e = findEmpresaById(empresaId);
        deleteEmpresa(e);

        // USANDO ITERATOR -> Código legado
//		Iterator<Empresa> it = Banco.lista.iterator();
//		while (it.hasNext()) {
//			Empresa emp = it.next();
//			if (emp.getId() == empresaId) {
//				it.remove();
//				continue;
//			}
//		}
        // USANDO ForEach -> Método atual
//		Empresa e = null; // Variável que serve apenas para guardar objeto que irá ser removido.
//		for (Empresa empresa : lista) {
//			if (empresa.getId() == empresaId) {
////				Banco.lista.remove(empresaId); //Threws ConcurrentModificationException
//				e = empresa;
//				continue;
//			}
//		}
//		this.deleteEmpresa(e);
    }

    private void deleteEmpresa(Object empresa) {
        Banco.listaEmpresas.remove(empresa);
    }

    public Usuario getUsuario(String login, String password) {
        for (Usuario usuario : Banco.listaUsuarios) {
            if (usuario.equals(login, password)) {
                return usuario;
            }
        }
        return null;
    }
}
