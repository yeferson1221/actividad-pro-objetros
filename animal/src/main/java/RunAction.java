import corral.Animal;
import corral.Cat;
import corral.Dog;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * [
 *   Contiene el metodo main donde instanciamos clase Dog y Cat
 *   por medio de una condicion
 * ]
 * @version [1,0.0]
 *
 * @author [Yeferson Valencia, alejandro.yand@gmail.com]
 * @since [1,0,0]
 *
 */
public class RunAction {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        Logger log = Logger.getLogger(Animal.class.getName());
        Scanner in = new Scanner(System.in);
        log.info("Opcion 1)Perro Opcion 2)Gato");
        int option=in.nextInt();

        if(option==1){
            dog.introLog();
            dog.calculateAge();
            dog.run();
            dog.eat();
        }else if(option==2){
            cat.introLog();
            cat.calculateAge();
            cat.run();
            cat.eat();
        }
    }
}
