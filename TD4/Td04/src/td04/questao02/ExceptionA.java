/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td04.questao02;

/**
 *
 * @author Hugo Sousa 378998
 */
public class ExceptionA extends Exception{
    public ExceptionA(){
        super("EXCEÇÃO A");
    }public ExceptionA(String msg){
        super(msg+ ", que é uma EXCEÇÃO A");
    }
    
}
