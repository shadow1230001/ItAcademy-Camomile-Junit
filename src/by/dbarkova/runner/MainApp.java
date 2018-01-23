package by.dbarkova.runner;

import by.dbarkova.bean.Flower;
import by.dbarkova.logic.FortuneTellerCollections;

import java.util.HashMap;
import java.util.HashSet;

public class MainApp {

	public static void main(String[] args) {
		
		Flower flower = new Flower("Camomile", 10, 1);
		
		flower.bloom(30, "Yellow");
		
		FortuneTellerCollections fortuneTeller = new FortuneTellerCollections(new HashMap<Integer, String>(), new HashSet<String>());
		
		fortuneTeller.addPredictionType(1, "Love");
		fortuneTeller.addPredictionType(2, "Luck");
		fortuneTeller.addPredictionType(3, "Future");
		
		fortuneTeller.addPrediction("extremely good luck is waiting for you");
		fortuneTeller.addPrediction("work hard and you will be rewarded");
		fortuneTeller.addPrediction("be aware of forthcoming troubles");
		fortuneTeller.addPrediction("be very careful, bad luck is chasing you");
		fortuneTeller.addPrediction("black bar period is up to be finished");
		fortuneTeller.addPrediction("significant encounter");
		fortuneTeller.addPrediction("great grief");
		fortuneTeller.addPrediction("long way");
		fortuneTeller.addPrediction("easy money");
		fortuneTeller.addPrediction("hard choice");
		fortuneTeller.addPrediction("happiness");
		
		fortuneTeller.getPrediction(flower, 3);
		
		
		//BotanicEncyclopedia botanicEncyclopedia = new BotanicEncyclopedia();
		
		//botanicEncyclopedia.printFlowerInfo(flower);
		
		//flower.grow(25, 3, 5);
		//botanicEncyclopedia.printFlowerInfo(flower);
		
		
		//botanicEncyclopedia.printFlowerInfo(flower);
		
		//flower.wither(2, "Grey", 20, 2);
		//botanicEncyclopedia.printFlowerInfo(flower);
		
		//Fortuneteller fortuneteller = new Fortuneteller();
		
		//Flower flowerFortune = new Flower("Camomile", 10, 1);
		//flowerFortune.bloom(30, "Yellow");
		
		//fortuneteller.readLoveFortune(flowerFortune);
		
		//fortuneteller.predictionRequest(3, flower);
		
		
		
		

	}

}
