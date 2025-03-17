package PokemonProject;

public class Cards extends Deck
{
  private String name;
  private String type;
  private int hp;
  private int attack1;
  private int attack2;

  public Cards(String userInputName, String userInputType, int userInputHp, int userInputAttack1, int userInputAttack2){
      name = userInputName;
      type = userInputType;
      hp = userInputHp;
      attack1 = userInputAttack1;
      attack2 = userInputAttack2;
    }

  public Cards(String userInputEnergyName){
      name = userInputEnergyName;
  }

    public int getHp() {
      return hp;
    }

    public int getAttack1(){
      return attack1;
    }

    public int getAttack2() {
        return attack2;
    }

    public String getName(){
      return name;
    }

    public String getType() {
      return type;
    }

    public void setHp(int hp) {
      this.hp = hp;
    }

    public void setAttack1(int attack) {
      this.attack1 = attack;
    }

    public void setAttack2(int attack2) {
        this.attack2 = attack2;
    }

    public void setName(String name) {
      this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }


}
