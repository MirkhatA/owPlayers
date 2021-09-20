package Hero;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Sigma sigma = new Sigma();
        DVa dVa = new DVa();
        Echo echo = new Echo();
        Reinhardt reinhardt = new Reinhardt();

        sigma.display();
        sigma.fly();
        sigma.run();
        sigma.attack();

        dVa.display();
        dVa.fly();
        dVa.run();
        dVa.attack();

        echo.display();
        echo.fly();
        echo.run();
        echo.attack();

        reinhardt.display();
        reinhardt.fly();
        reinhardt.run();
        reinhardt.attack();
    }

}
