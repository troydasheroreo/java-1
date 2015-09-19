
import java.util.*;
final public class Charizard implements PokemonInterface {

    public double height = 1.7;
    public double weight = 90.5;
    public int speed = 100;
    public int hp = 78;
    public int attack = 84;
    public int specialAttack = 109;
    public int defense = 78;
    public int speicalDefense = 85;
    //public ArrayList<Type> type =  new ArrayList<Type>();
    public ArrayList<Move> moves = new ArrayList<Move>();
        public Charizard() { 
        Growl growl = new Growl();
        //moves.add(new Sratch()),
        moves.add(new Growl());
        //moves.add(new Leer()),
        //moves.add(new Ember()),
    }
   // public ArrayList<Ability> abilities = new ArrayList<Ability>();



}
