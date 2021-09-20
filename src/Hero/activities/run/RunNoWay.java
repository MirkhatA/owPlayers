package Hero.activities.run;

import Hero.Behavior.RunBehavior;

public class RunNoWay implements RunBehavior {
    @Override
    public void run() {
        System.out.println("I can't run(");
    }
}
