package by.dbarkova.logic;

import by.dbarkova.bean.Bud;
import by.dbarkova.bean.Flower;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestFortuneTellerCollections {

    @Test
    public void testAddPredictionType() {
        Map<Integer, String> predictionTypes = new HashMap<Integer, String>();
        String EMPTY = " ";
        predictionTypes.put(1, EMPTY);
        Set<String> predictions = new HashSet<String>();
        predictions.add(EMPTY);
        FortuneTellerCollections fortuneTellerCollections = new FortuneTellerCollections(predictionTypes, predictions);
        fortuneTellerCollections.addPredictionType(1, EMPTY);
        Assert.assertEquals(EMPTY, EMPTY);
    }

    @Test
    public void testAddPrediction() {
        Map<Integer, String> predictionTypes = new HashMap<Integer, String>();
        Set<String> predictions = new HashSet<String>();
        String EMPTY = " ";
        predictions.add(EMPTY);
        FortuneTellerCollections fortuneTellerCollections = new FortuneTellerCollections(predictionTypes, predictions);
        fortuneTellerCollections.addPrediction(EMPTY);
        Assert.assertEquals(EMPTY, EMPTY);
    }

    @Test
    public void testGetPrediction() {

        Bud bud = new Bud();
        Flower flower = new Flower("chamomile", 20, 20);
        flower.setBud(bud);
        bud.addFreshLeaves(5, "green", "square");
        Map<Integer, String> predictionTypes = new HashMap<Integer, String>();
        String EMPTY = " ";
        predictionTypes.put(1, EMPTY);
        Set<String> predictions = new HashSet<String>();
        predictions.add(EMPTY);
        FortuneTellerCollections fortuneTellerCollections = new FortuneTellerCollections(predictionTypes, predictions);
        fortuneTellerCollections.getPrediction(flower, 1);
        Assert.assertEquals(EMPTY, EMPTY);

    }

}
