public class Soldier {
  String surname;
  String rank;
  boolean wounded;

  public Soldier(String surname, String rank, boolean wounded) {
    this.surname = surname;
    this.rank = rank;
    this.wounded = wounded;
  }

  public String getRank() {
    return rank;
  }

  public boolean isWounded() {
    return wounded;
  }

  public String getSurname() {
    return surname;
  }
}
