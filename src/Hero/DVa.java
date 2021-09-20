package Hero;

import Hero.Hero;
import Hero.activities.attack.AttackByGuns;
import Hero.activities.attack.AttackByMelee;
import Hero.activities.fly.FlyByJetpack;
import Hero.activities.run.RunByLegs;

public class DVa extends Hero {
    public DVa() {
        super(new FlyByJetpack(), new RunByLegs(), new AttackByGuns());
    }

    @Override
    public void display() {
        System.out.println("\nChosen hero: DVa \nAPM jom ollyeo bolkka?");
    }
}
