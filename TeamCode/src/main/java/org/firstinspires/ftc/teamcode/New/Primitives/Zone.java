package org.firstinspires.ftc.teamcode.New.Primitives;

import static org.firstinspires.ftc.teamcode.New.Operators.Constants.eps;

import android.annotation.SuppressLint;

public class Zone {
    public static dot a, b, c, d;
    @SuppressLint("NotConstructor")
    public Zone(dot a, dot b, dot c, dot d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public boolean isDotInZone(dot bot){
        double S1 = ((b.x - a.x) * (c.y - a.y) - (b.y - a.y) * (c.x - a.x))/2;
        double S2 = ((c.x - a.x) * (d.y - a.y) - (c.y - a.y) * (d.x - a.x))/2;

        double c1 = ((b.x - a.x) * (bot.y - a.y) - (b.y - a.y) * (bot.x - a.x));
        double c2 = ((c.x - b.x) * (bot.y - b.y) - (c.y - b.y) * (bot.x - b.x));
        double c3 = ((a.x - c.x) * (bot.y - c.y) - (a.y - c.y) * (bot.x - c.x));

        double d1 = ((c.x - a.x) * (bot.y - a.y) - (c.y - a.y) * (bot.x - a.x));
        double d2 = ((d.x - c.x) * (bot.y - c.y) - (b.y - c.y) * (bot.x - c.x));
        double d3 = ((a.x - d.x) * (bot.y - d.y) - (a.y - d.y) * (bot.x - d.x));
        return (S1 > 0 && c1 >= -eps && c2 >= -eps && c3 >= -eps) ||
                (S1 < 0 && c1 <= eps && c2 <= eps && c3 <= eps) ||
                (S2 > 0 && d1 >= -eps && d2 >= -eps && d3 >= -eps) ||
                (S2 < 0 && d1 <= eps && d2 <= eps && d3 <= eps);
    }
}
