package Hero.activities.attack;

import Hero.Behavior.AttackBehavior;

public class AttackByGuns implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("Attack by guns");
    }
}
