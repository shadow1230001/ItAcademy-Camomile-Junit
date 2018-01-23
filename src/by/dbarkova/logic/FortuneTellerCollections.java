package by.dbarkova.logic;

import by.dbarkova.bean.Flower;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FortuneTellerCollections {
	
	private Map<Integer,String> predictionTypes;
	private Set<String> predictions ;
	
	public FortuneTellerCollections(Map<Integer,String> predictionTypes, Set<String> predictions) {
		this.predictionTypes = predictionTypes;
		this.predictions = predictions;
	}
	
	public void addPredictionType(Integer key, String value) {
		predictionTypes.put(key, value);
	}
	
	public void addPrediction(String value) {
		predictions.add(value);
	}
	
	public void getPrediction(Flower flower, Integer key) {
		Iterator<String> predictionsIterator = predictions.iterator();
		String prediction = null;
		for(int i = 0; i < flower.getBud().getLeaves().length; i++) {
			if(predictionsIterator.hasNext()) {
			     prediction = predictionsIterator.next();
			}else {
				predictionsIterator = predictions.iterator();
				prediction = predictionsIterator.next();
			}
		}
		System.out.println("Your prediction for " + predictionTypes.get(key) + " is: " + prediction);
	}
		
}
