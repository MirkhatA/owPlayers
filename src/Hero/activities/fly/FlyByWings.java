package Hero.activities.fly;

import Hero.Behavior.FlyBehavior;

public class FlyByWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I have wings! so I'm gonna fly!");
    }
}
