package corral;

import interfaces.ActionDog;

/**
 * [
 *   Contiene clase dog porque por ehrencia ereda atributos y metdos de animal
 *   demas tiene su metetodo unico Calculate age
 * ]
 * @version [1,0.0]
 *
 * @author [Yeferson Valencia, alejandro.yand@gmail.com]
 * @since [1,0,0]
 *
 */
public class Dog extends Animal implements ActionDog {

    public void calculateAge(){
        int ageFinal=age*7;
        log.info("los años gatunos son: "+ageFinal);
    }

    public void run() {
        log.info("se recomienda hacer 5 horas de ejercicios al dia");
    }

    public void eat() {
        log.info("solo puede comer 1000 gramos en noche, 1500 gramos al dia");
    }

    @Override
    public void trainingDog() {
        log.info("1) Educalo: es importante enseñarle a dar la patita" );
    }
}
