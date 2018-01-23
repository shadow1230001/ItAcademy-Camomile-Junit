package by.dbarkova.logic;

import by.dbarkova.bean.Flower;
import by.dbarkova.bean.Leaf;

public class Fortuneteller {
	private String prediction;
	private int predictionalType;

	public String getPrediction() {
		return prediction;
	}

	public int getPredictionalType() {
		return predictionalType;
	}

	public void readLoveFortune(Flower flower) throws  NullPointerException{
	  Leaf[] leavesFlower = flower.getBud().getLeaves();
	  
	  for(int i = 0; i < leavesFlower.length; i += 4){
		 int c = 0;
		 for(c = 0; c < 4; c++) {
		 switch(c)
		 {
		 case 0 :
			 prediction = "loves";
			 break;
		 case 1 :
			 prediction = "does not love";
			 break;
		 case 2 :
			 prediction = "likely loves";
			 break;
		 case 3 :
			 prediction = "unlikely loves";
			 break;
		 }
	  if(i+c == leavesFlower.length - 1) {
		  System.out.println("\nMy prediction is that he(she) " + prediction + " you!");
	  }
	  }
    }
  }
	
	public void readLuckFortune(Flower flower) {
		Leaf[] leavesFlower = flower.getBud().getLeaves();
		
		for (int i = 0; i < leavesFlower.length; i += 5) {
			int c;
			for (c = 0; c < 5; c++) {
				switch(c) {
				case 0 :
					prediction = "extremely good luck is waiting for you";
					break;
				case 1 :
					prediction = "work hard and you will be rewarded";
					break;
				case 2 :
					prediction = "be aware of forthcoming troubles";
					break;
				case 3 :
					prediction = "be very careful, bad luck is chasing you";
					break;
				case 4 :
					prediction = "black bar period is up to be finished";
					break;
				}
				if(i + c == leavesFlower.length - 1) {
					System.out.println("\nMy prediction is: " + prediction + " !");
			}
		}
			
	  }
	}
	
	public void readFutureFortune(Flower flower) {
		Leaf[] leavesFlower = flower.getBud().getLeaves();
		
		for(int i = 0; i < leavesFlower.length; i += 6) {
			int c;
			for (c = 0; c < 6; c++) {
				switch(c) {
				case 0 : 
					prediction = "significant encounter";
					break;
				case 1 :
					prediction = "great grief";
					break;
				case 2 :
					prediction = "long way";
					break;
				case 3 :
					prediction = "easy money";
					break;
				case 4 :
					prediction = "hard choice";
					break;
				case 5 :
					prediction = "happiness";
					break;
				}
				if(i + c == leavesFlower.length - 1) {
					System.out.println("My prediction is: " + prediction + " is waiting for you!");
				}
			}
		}
	}
	
	public void predictionRequest(int predictionType, Flower flower) {
		switch(predictionType) {
		case 1 : 
			readLoveFortune(flower);
			break;
		case 2 :
			readLuckFortune(flower);
			break;
		case 3 :
			readFutureFortune(flower);
			break;
		}
	}
}
