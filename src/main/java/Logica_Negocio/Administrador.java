/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import Helpers.HelperCifrado;

/**
 *
 * @author Equipo
 */
public class Administrador extends Usuario {

    public Administrador() {
    }

    public Administrador(String usuario, String contraseña) {
        super(usuario, contraseña);
    }
    @Override
    public boolean LogOn(String Usu, String Cotra) {
        boolean res = true;
        String ComprobarUsuario = HelperCifrado.CifrarSHA256(getUsu());
        String ComprobarContra = HelperCifrado.CifrarSHA256(getContra());
        System.out.println("usu ci abs" + "\t" + ComprobarUsuario);
        System.out.println("usu ci abs" + "\t" + ComprobarContra);

        if (ComprobarUsuario.compareTo(Usu) == 0 && ComprobarContra.compareTo(Cotra) == 0) {
            return res;

        } else {

            return !res;

    
        }
    
}
}