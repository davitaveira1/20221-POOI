/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula11;

/**
 *
 * @author Davi
 */
public class ContaEmpresarial extends Conta {
    
    private double limite;

    public ContaEmpresarial() {
    }
/*
    public ContaEmpresarial(double limite,int numero,String titular,double saldo) {
        super(numero,titular,saldo);
        this.limite = limite;
    }
*/

    public ContaEmpresarial(double limite, int conta, String titular, double saldo) {
        super(conta, titular, saldo);
        this.limite = limite;
    }

    
    
    
}
