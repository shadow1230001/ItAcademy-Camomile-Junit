package by.dbarkova.logic;

import by.dbarkova.bean.Bud;
import by.dbarkova.bean.Flower;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFortuneteller {


    @Test
    public void testReadLoveFortune() {
        Bud bud = new Bud();
        Flower flower = new Flower("chamomile", 20, 20);
        flower.setBud(bud);
        bud.addFreshLeaves(5, "green", "square");
        Fortuneteller fortuneteller = new Fortuneteller();
        fortuneteller.readLoveFortune(flower);
        Assert.assertEquals("unlikely loves", fortuneteller.getPrediction());
    }

    @Test
    public void testReadLuckFortune() {
        Bud bud = new Bud();
        Flower flower = new Flower("chamomile", 20, 20);
        flower.setBud(bud);
        bud.addFreshLeaves(5, "green", "square");
        Fortuneteller fortuneteller = new Fortuneteller();
        fortuneteller.readLuckFortune(flower);
        Assert.assertEquals("black bar period is up to be finished", fortuneteller.getPrediction());
    }

    @Test
    public void testReadFutureFortune() {
        Bud bud = new Bud();
        Flower flower = new Flower("chamomile", 20, 20);
        flower.setBud(bud);
        bud.addFreshLeaves(5, "green", "square");
        Fortuneteller fortuneteller = new Fortuneteller();
        fortuneteller.readFutureFortune(flower);
        Assert.assertEquals("happiness", fortuneteller.getPrediction());

    }

    @Test
    public void testPredictionRequest() {
        Bud bud = new Bud();
        Flower flower = new Flower("chamomile", 20, 20);
        flower.setBud(bud);
        bud.addFreshLeaves(5, "green", "square");
        Fortuneteller fortuneteller = new Fortuneteller();
        fortuneteller.predictionRequest(2, flower);
        Assert.assertSame(0, fortuneteller.getPredictionalType());

    }
}
