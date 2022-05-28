package corral;
/**
 * [
 *   Contiene clase Cat porque por ehrencia ereda atributos y metdos de animal
 *   demas tiene su metetodo unico Calculate age
 * ]
 * @version [1,0.0]
 *
 * @author [Yeferson Valencia, alejandro.yand@gmail.com]
 * @since [1,0,0]
 *
 */
public class Cat extends Animal{

    public void calculateAge(){
        int ageFinal=age*4;
        log.info("los años gatunos son: "+ageFinal);
    }

    public void run() {
        log.info("Se recomienda que el gato hace 1 hora de ejercicio al dia");
    }

    public void eat() {
        log.info("solo puede comer 40 gramos en noche, 50 gramos al dia");
    }
}
