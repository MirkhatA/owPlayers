package Hero;

import Hero.activities.attack.AttackByMelee;
import Hero.activities.fly.FlyNoWay;
import Hero.activities.run.RunByLegs;

public class Reinhardt extends Hero{
    public Reinhardt() {
        super(new FlyNoWay(), new RunByLegs(), new AttackByMelee());
    }

    @Override
    public void display() {
        System.out.println("\nChosen hero: Reinhardt \nDon't worry my friends. I will be your shield");
    }
}
