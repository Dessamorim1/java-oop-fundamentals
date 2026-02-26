package Exercicio_3;

public class Quadrado {
    int lado;

    Quadrado(){
        this.lado = 0;
    }

    Quadrado(int lado){
        this.lado = lado;
    }

    double area(){
        return this.lado * this.lado;
    }

    double comprimento(){
        return this.lado * 4;
    }

    void desenha(){
     for(int i=0;i<this.lado;i++){
        for(int j=0;j<this.lado;j++){
            System.out.print("* ");
        }
        System.out.println();
     }
    }
    
}
