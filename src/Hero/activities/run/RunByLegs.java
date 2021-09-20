package Hero.activities.run;

import Hero.Behavior.RunBehavior;

public class RunByLegs implements RunBehavior {
    @Override
    public void run() {
        System.out.println("I can run!");
    }
}
