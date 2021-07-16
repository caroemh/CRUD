/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import modelo.dao.PaisDao;
import modelo.entidad.Pais;

/**
 *
 * @author Carolina
 */
@ManagedBean
@javax.faces.bean.ViewScoped
public class PaisControl implements Serializable {

    private List<Pais> listaPaiss;
    private Pais pais;

    /**
     * Creates a new instance of PaisControl
     */
    public PaisControl() {
    }

    public List<Pais> getListaPaiss() {
        PaisDao ed = new PaisDao();
        listaPaiss = ed.listarPaiss();
        return listaPaiss;
    }

    public void setListaPaiss(List<Pais> listaPaiss) {
        this.listaPaiss = listaPaiss;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public void limpiarPais() {
        pais = new Pais();
    }

    public void agregarPais() {
        PaisDao ed = new PaisDao();
        ed.agregar(pais);
    }

    public void modificarPais() {
        PaisDao ed = new PaisDao();
        ed.modificar(pais);
        limpiarPais();
    }

    public void eliminarPais() {
        PaisDao ed = new PaisDao();
        ed.eliminar(pais);
        limpiarPais();
    }

}