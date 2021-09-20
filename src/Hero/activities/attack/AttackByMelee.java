package Hero.activities.attack;

import Hero.Behavior.AttackBehavior;

public class AttackByMelee implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("Attack by melee");
    }
}
