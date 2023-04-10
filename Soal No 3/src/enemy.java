public class enemy {
    private String name;
    private int hp;
    private int attackdamage;

    public enemy(String name, int hp, int attackdamage) {
        this.name = name;
        this.hp = hp;
        this.attackdamage = attackdamage;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackdamage() {
        return attackdamage;
    }


    public void setAttackdamage(int attackdamage) {
        this.attackdamage = attackdamage;
    }

    @Override
    public String toString() {
        return "enemy{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", attackdamage=" + attackdamage +
                '}';
    }

}
