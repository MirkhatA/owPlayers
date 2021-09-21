package Hero;

import Hero.Behavior.AttackBehavior;
import Hero.Behavior.FlyBehavior;
import Hero.Behavior.RunBehavior;

public abstract class Hero {
    private FlyBehavior flyBehavior;
    private RunBehavior runBehavior;
    private AttackBehavior attackBehavior;

    public Hero(FlyBehavior flyBehavior, RunBehavior runBehavior, AttackBehavior attackBehavior) {
        this.flyBehavior = flyBehavior;
        this.runBehavior = runBehavior;
        this.attackBehavior = attackBehavior;
    }

    public Hero() {}

    public void fly() {
        flyBehavior.fly();
    }

    public void run() {
        runBehavior.run();
    }

    public void attack() {
        attackBehavior.attack();
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setRunBehavior(RunBehavior runBehavior) {
        this.runBehavior = runBehavior;
    }

    public void setAttackBehavior(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }
}
