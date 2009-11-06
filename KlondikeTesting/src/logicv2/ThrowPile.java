package logicv2;
//throwpile er der de kortene du trekker ender
public class ThrowPile extends CardPile {
	
	public ThrowPile() {
		super();
	}
	
	public void addCard(CardPile source) {
		Card c = source.pop();
		c.setFaceUp();
		this.push(c);	
	}
	
	public void drawCard(CardPile target){
		target.push(this.pop());
	}
}