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
public class Cliente  extends Usuario{
    
     public Cliente(String usuario, String contraseña) {
        super(usuario, contraseña);
    }

    @Override
    public boolean LogOn(String usuario, String Contraseña) {
          boolean res = true;
        String ComprobarUsuario = HelperCifrado.CifrarSHA256(getUsu());
        String ComprobarContra = HelperCifrado.CifrarSHA256(getContra());
        System.out.println("usu ci abs" + "\t" + ComprobarUsuario);
        System.out.println("usu ci abs" + "\t" + ComprobarContra);

        if (ComprobarUsuario.compareTo(usuario) == 0 && ComprobarContra.compareTo(Contraseña) == 0) {
            return res;

        } else {

            return !res;

    
        }
    }
}
