package Hero;

import Hero.activities.attack.AttackByMelee;
import Hero.activities.attack.AttackByProjectile;
import Hero.activities.fly.FlyByLevitation;
import Hero.activities.fly.FlyByWings;
import Hero.activities.fly.FlyNoWay;
import Hero.activities.run.RunNoWay;

public class Echo extends Hero {
    public Echo() {
        super(new FlyByWings(), new RunNoWay(), new AttackByProjectile());
    }

    @Override
    public void display() {
        System.out.println("\nChosen hero: Echo \nAdjusting angle of attack.");
    }
}
