package corral;

import interfaces.Actions;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * [
 *   tenemos la clase abstracta Animal la cual implementa una interface de Action
 *   adicional tiene le metodo para recolectar los datos del animal con sus atributos
 *   name y age
 * ]
 * @version [1,0.0]
 *
 * @author [Yeferson Valencia, alejandro.yand@gmail.com]
 * @since [1,0,0]
 *
 */
public abstract class  Animal implements Actions {
    protected Logger log = Logger.getLogger(Animal.class.getName());
    protected String name;
    protected int age;

    public void introLog(){
        Scanner in = new Scanner(System.in);
        log.info("ingresar especie del animal");
        name= in.next();
        log.info("ingresar especie del ege");
        age= in.nextInt();
    }
}
