package Hero.activities.fly;

import Hero.Behavior.FlyBehavior;

public class FlyByLevitation implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can levitate! so I can't land");
    }
}
