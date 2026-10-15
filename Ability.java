public interface Ability {

  public double damage;
  
  public double attackSpeed;
  
  public boolean AOE;
  
  if (AOE) {
     public double area;
  }
  
  public boolean ranged;
  
  if (ranged) {
     public double range;
  }
  
  public class extraFuncs() {
  
  }
  
  public Array[] effects = {"burn", "chill", "poison", "void", "slow", "speedup"};
  
  public Array[] abilityBasics = {damage, attackSpeed, AOE, ranged, effects};
  
  public Dictionary<String, Image[]> animations;
}