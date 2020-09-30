package day0923;

public class Hero implements HeroAction{
    String name;
    @Override
    public void hit(Hero hero){
        System.out.println(name+"攻击了"+hero.name+"一次");
    }

    @Override
    public void buy(Equipment equipment) {
        System.out.println(name+"购买了"+equipment.name+"能力获得了提升");
    }

    @Override
    public void die() {
        System.out.println(name+"死了");
    }

    @Override
    public void upgrade() {
        System.out.println(name+"升级了");
    }
}
