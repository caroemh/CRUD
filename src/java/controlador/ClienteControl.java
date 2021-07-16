/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.dao.ClienteDao;
import modelo.entidad.Cliente;

/**
 *
 * @author Carolina
 */
@ManagedBean
@ViewScoped
public class ClienteControl implements Serializable {

    private List<Cliente> listaClientes;
    private Cliente cliente;

    /**
     * Creates a new instance of ClienteControl
     */
    public ClienteControl() {
    }

    public List<Cliente> getListaClientes() {
        ClienteDao ed = new ClienteDao();
        listaClientes = ed.listarClientes();
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void limpiarCliente() {
        cliente = new Cliente();
    }

    public void agregarCliente() {
        ClienteDao ed = new ClienteDao();
        ed.agregar(cliente);
    }

    public void modificarCliente() {
        ClienteDao ed = new ClienteDao();
        ed.modificar(cliente);
        limpiarCliente();
    }

    public void eliminarCliente() {
        ClienteDao ed = new ClienteDao();
        ed.eliminar(cliente);
        limpiarCliente();
    }

}