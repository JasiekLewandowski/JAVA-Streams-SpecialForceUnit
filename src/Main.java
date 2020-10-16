import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Soldier> specialForceUnitAlpha = new ArrayList<>();
    //Privates
    specialForceUnitAlpha.add(new Soldier("O'Riley","private", false));
    specialForceUnitAlpha.add(new Soldier("Ryan","private", true));
    specialForceUnitAlpha.add(new Soldier("Kavinsky","private", false));
    specialForceUnitAlpha.add(new Soldier("Robertson","private", false));
    specialForceUnitAlpha.add(new Soldier("McDonald","private", true));
    specialForceUnitAlpha.add(new Soldier("Svenson","corporal", false));
    specialForceUnitAlpha.add(new Soldier("Georgson","corporal", true));
    specialForceUnitAlpha.add(new Soldier("Mark","corporal", false));
    specialForceUnitAlpha.add(new Soldier("O'Donell","sergeant", false));
    specialForceUnitAlpha.add(new Soldier("Fitzgerald","sergeant", false));
    specialForceUnitAlpha.add(new Soldier("Shepard","captain", false));

  getWoundedList(specialForceUnitAlpha);
  getByRank(specialForceUnitAlpha, "private");
  getByRank(specialForceUnitAlpha, "captain");
  }

  private static void getWoundedList(List<Soldier> unit){
    System.out.println("=Wounderd soldiers:");
    unit.stream()
            .filter(soldier -> soldier.isWounded()==true)
            .forEach(soldier -> System.out.println(soldier.getRank() + " " + soldier.surname));
  }
  private static void getByRank(List<Soldier> unit, String rank){
    System.out.println("=" + rank + "s in this unit:");
    unit.stream()
            .filter(soldier -> soldier.getRank().equals(rank))
            .forEach(soldier -> System.out.println(soldier.getRank() + " " + soldier.surname));
  }
}
