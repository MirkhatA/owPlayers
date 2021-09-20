package Hero.activities.fly;

import Hero.Behavior.FlyBehavior;

public class FlyByJetpack implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I have jetpack! so I can fly!");
    }
}
