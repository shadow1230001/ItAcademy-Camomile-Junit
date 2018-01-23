package by.dbarkova.bean;

public class Flower {
	
	private String title;
	private Bud bud;
	private Stem stem;
	
	public Flower(String title){
		this.title = title;
		stem = new Stem(10, 1);
		bud = new Bud();
	}

	public Flower(String title, int stemH, int stemW){
		this.title = title;
		stem = new Stem(stemH, stemW);
		bud = new Bud();
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Bud getBud() {
		return bud;
	}

	public void setBud(Bud bud) {
		this.bud = bud;
	}

	public Stem getStem() {
		return stem;
	}

	public void setStem(Stem stem) {
		this.stem = stem;
	}
	
	public void grow(int newStemH, int newStemW, int newBudSize){
		this.stem.setHeight(newStemH);
		this.stem.setWidth(newStemW);
		this.bud.setSize(newBudSize);
	}
	
	public void bloom(int newBudSize, String newBudColor){
		bud.setSize(newBudSize);
		bud.setColor(newBudColor);
		bud.addFreshLeaves(15, "white", "ellipse");
	}
	
	public void wither(int newBudSize, String newBudColor, int newStemH, int newStemW){
		bud.setSize(newBudSize);
		bud.setColor(newBudColor);
		stem.setHeight(newStemH);
		stem.setWidth(newStemW);
		bud.witherLeaves();
		
		
	}
	
}
