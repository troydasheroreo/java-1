
import java.util.ArrayList;

public abstract interface PokemonInterface {

    public float height = 0;
    public float weight = 0;
    public int speed = 0;
    public int hp = 0;
   
    public int attack = 0;
    public int specialAttack = 0;
    public int defense = 0;
    public int speicalDefense = 0;
    public ArrayList<Type> type =  new ArrayList<Type>();
    public ArrayList<Move> moves = new ArrayList<Move>();
    public ArrayList<Ability> abilities = new ArrayList<Ability>();
}
