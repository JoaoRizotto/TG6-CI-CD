/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilh
 */
public class TG6 {
    public boolean emprestimo(double saldo, boolean bomPagador, boolean especial) {
        if (saldo > 1000 || bomPagador == true || especial == true) {
            return true;
        }
        return false;
    } 
}
