package edu.douglas.segundasemana;
public class BoletimEstudantil {

    public static void main (String[] args)
    {
        // Entrada para a nota do aluno
        int mediaFinal = 7;
        if(mediaFinal < 6)
            System.out.println("REPROVADO");
    
        else if(mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        
        else 
            System.out.println("APROVADO");
    }
}
