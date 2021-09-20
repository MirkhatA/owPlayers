package Hero.activities.attack;

import Hero.Behavior.AttackBehavior;

public class AttackByProjectile implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("Projectile attack");
    }
}
