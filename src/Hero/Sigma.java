package Hero;

import Hero.Hero;
import Hero.activities.attack.AttackByMelee;
import Hero.activities.attack.AttackByProjectile;
import Hero.activities.fly.FlyByLevitation;
import Hero.activities.fly.FlyNoWay;
import Hero.activities.run.RunByLegs;
import Hero.activities.run.RunNoWay;

public class Sigma extends Hero {
    public Sigma() {
        super(new FlyByLevitation(), new RunNoWay(), new AttackByProjectile());
    }

    @Override
    public void display() {
        System.out.println("\nChosen hero: Sigma \nActivating the barrier!");
    }
}
