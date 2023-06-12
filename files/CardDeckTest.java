class Card { 
	public static final int KIND_MAX = 4; // 카드 무늬의 수 
	public static final int NUM_MAX = 13; // 무늬별 카드 수 

	public static final int SPADE = 4; 
	public static final int DIAMOND = 3; 
	public static final int HEART = 2; 
	public static final int CLOVER = 1; 

	public int kind; 
	public int number; 

	public Card() { this(SPADE, 1); } 
	public Card(int kind, int number) { 
		this.kind = kind; 
		this.number = number; 
	}

	//*
	public String toString() { 
		String kind="", number=""; 
		switch(this.kind) { 
			case 4 : 
				//kind = "SPADE"; 
				kind = "S"; 
				break; 
			case 3 : 
				//kind = "DIAMOND"; 
				kind = "D";
				break;
			case 2 : 
				// kind = "HEART"; 
				kind = "H";
				break; 
			case 1 : 
				// kind = "CLOVER"; 
				kind = "C";
				break; 
			default : kind = "Wrong Shape";
		} 

		switch(this.number) { 
			case 13 : 
				number = "K"; 
				break; 
			case 12 : 
				number = "Q";
				break;
			case 11 :
				number = "J";
				break;
			default :
				number = this.number + "";
		} 
		//return "kind : " + kind + ", number : " + number; 
		return "[ " + kind + " : " + number+" ] ";
      }
	  //*/
}

class Deck { 
	public final int CARD_NUM = 52;
	public Card c[] = new Card[CARD_NUM]; 

	public Deck () {
		int i=0; 
		for(int k=Card.KIND_MAX; k > 0; k--) { 
			for(int n=1; n < Card.NUM_MAX + 1 ; n++) c[i++] = new Card(k, n);
		} 
	}

	public Card pick(int index) { return c[index%CARD_NUM]; } 
	public Card pick() { return pick((int)(Math.random()*CARD_NUM)); } 

	public void shuffle() {
		for(int n=0; n < 1000; n++) { 
			int i = (int)(Math.random() * CARD_NUM); 
			Card temp = c[0];
			c[0] = c[i]; 
			c[i] = temp; 
		} 
	}

	public void printDeck()	{
		int i=0;
		for(int k=Card.KIND_MAX; k > 0; k--) { 
			for(int n=1; n < Card.NUM_MAX + 1 ; n++) System.out.print(c[i++].toString() + " ");
			System.out.println();
		} 
	}
} 

class CardDeckTest
{ 
	public static void main(String args[])
	{ 
		
		/*
		Card a=new Card(2,11);
		System.out.println(a.toString());
		//*/

		/*
		Deck b=new Deck();
		// b.printDeck();
		//b.shuffle(); b.printDeck();
		//*/
		
		/*
		Deck d = new Deck();
		//d.shuffle(); 
		
		/*
		Card c = d.pick(0);
		System.out.println(c.toString()); 
		
		c = d.pick(0);
		System.out.println(c); 
		//*/
		
		/*
		Card p1[]=new Card[5];
		for(int i=0;i<p1.length;i++) p1[i]=d.pick(i*5);
		System.out.print("Player 1's CARD's => ");
		for(int i=0;i<p1.length;i++) System.out.print(p1[i].toString()+" ");
		System.out.println();
		//*/

		/*
		final int PNUM=5;
		Card players[][]=new Card[PNUM][5];
		for(int i=0;i<players.length;i++) 
			for(int j=0;j<players[i].length;j++) players[i][j]=d.pick(i+j*5);

		for(int i=0;i<players.length;i++) {
			System.out.print("Player "+i+"'s CARD's => ");
			for(int j=0;j<players[i].length;j++) System.out.print(players[i][j].toString()+" ");
			System.out.println();
		}
		//*/
		//*/
	} 
}